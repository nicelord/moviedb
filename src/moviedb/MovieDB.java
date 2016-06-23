package moviedb;

import com.jaunt.JNode;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class MovieDB
        extends Thread {

    String IMDBUrl;
    FormUtama fu;

    public MovieDB(String IMDBUrl, FormUtama fu) {
        this.IMDBUrl = IMDBUrl;
        this.fu = fu;
    }

    @Override
    public void run() {
        ImdbAPI();
        getTrailerAndKeyword();
//        UserAgent userAgent = new UserAgent();
        //getTrailerAndKeyword();
//        try {
//            this.fu.getTxtLog().append("Checking similiar title...\n");
//            userAgent.sendGET(this.fu.getTxtPostURL().getText() + "?check=" + this.fu.getTxtTitle().getText());
//            this.fu.getTxtLog().append(userAgent.doc.innerHTML(1).replace("<br>", ""));
//            this.fu.getTxtLog().append("\n");
//        } catch (ResponseException localResponseException) {
//        }
        this.fu.getTxtLog().append("DONE");
    }

    public void ImdbAPI() {

        try {
            UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)

            userAgent.sendGET("http://www.myapifilms.com/imdb/idIMDB?idIMDB=" + this.IMDBUrl + "&token=d462d732-e083-4ce7-a294-2434b034c990&format=json&language=en-us&aka=0&business=0&seasons=0&seasonYear=0&technical=0&trailers=0&movieTrivia=0&awards=0&moviePhotos=0&movieVideos=0&actors=1&biography=0&uniqueName=0&filmography=0&bornAndDead=0&starSign=0&actorActress=1&actorTrivia=0&similarMovies=0&goofs=0&quotes=0&fullSize=0&companyCredits=0");   //send request
            JNode movie = userAgent.json.findFirst("movies");
            String title = movie.findFirst("title").toString();
            fu.getTxtTitle().setText(title);

            String plot = movie.findFirst("plot").toString();
            fu.getTxtPlot().setText(plot);

            String year = movie.findFirst("year").toString();
            fu.getTxtYear().setText(year);

            String rating = movie.findFirst("rating").toString();
            fu.getTxtRating().setText(rating);

            String runtime = movie.findFirst("runtime").toString();
            fu.getTxtRuntime().setText(runtime);

            String poster = movie.findFirst("urlPoster").toString();
            fu.getTxtPoster().setText(poster.replace("\\", ""));

            JNode casts = movie.findEvery("actorName");
            for (JNode node : casts) {
                //System.out.println(node);
                fu.getTxtCast().append(node.toString() + ", ");
            }
            JNode directors = movie.findFirst("directors");
            for (JNode node : directors) {
                //System.out.println(node.get("name"));
                fu.getTxtDirectors().append(node.get("name").toString() + ", ");
            }
            JNode writers = movie.findFirst("writers");
            for (JNode node : writers) {
                //System.out.println(node.get("name"));
                fu.getTxtWriter().append(node.get("name").toString() + ", ");

            }
            JNode countries = movie.findFirst("countries");
            for (JNode node : countries) {
                //System.out.println(node);
                fu.getTxtCountries().append(node.toString() + ", ");
            }
            JNode genres = movie.findFirst("genres");
            for (JNode node : genres) {
                //System.out.println(node);
                fu.getTxtGenres().append(node.toString() + ", ");
            }

        } catch (ResponseException | NotFound ex) {
            fu.getTxtLog().append(ex.getMessage() + "\n");
            //Logger.getLogger(MovieDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getTrailerAndKeyword() {

        try {
            UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)
            userAgent.sendGET("http://www.myapifilms.com/tmdb/movieInfoImdb?idIMDB=" + this.IMDBUrl + "&token=d462d732-e083-4ce7-a294-2434b034c990&format=json&language=en&alternativeTitles=0&casts=0&images=0&keywords=1&releases=0&videos=1&translations=0&similar=0&reviews=0&lists=0");   //send request
            JNode keywords = userAgent.json.findFirst("keywords");
            for (JNode node : keywords) {
                //System.out.println(node.get("name"));
                fu.getTxtKeywords().append(node.get("name").toString() + ", ");
            }
            JNode videos = userAgent.json.findFirst("videos");
            for (JNode node : videos) {
             
                if(node.get("site").toString().equals("YouTube")){
                     fu.getTxtThrailer().append(node.get("key").toString() + ", ");
                }
                
            }
            
        } catch (ResponseException | NotFound ex) {
            fu.getTxtLog().append(ex.getMessage() + "\n");
            //Logger.getLogger(MovieDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
