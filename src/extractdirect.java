
import com.jaunt.JNode;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class extractdirect {

    public static void main(String[] args) {
        try {
            UserAgent userAgent = new UserAgent();
            
            userAgent.sendPOST("http://localhost/tes/spin.php", "text=Amuli Edelmann stars as Viktor Karppa, a former Russian special agent haunted by his past. He settles in Finland, the country of his ancestors, and tries to make a living as both a private investigator and business facilitator for Russian migrants, but finds himself continually involved with organized crime. Karppa isn't a killer, even if he looks like one. Can a man change his identity - or shed his loyalties - merely by crossing a border");
            System.out.println(userAgent.doc.innerHTML());
//create new userAgent (headless browser).
//            userAgent.visit("http://www.myapifilms.com/imdb/"
//                    + "idIMDB?title=batman&"
//                    + "token=d462d732-e083-4ce7-a294-2434b034c990&"
//                    + "format=json&"
//                    + "language=en-us&"
//                    + "aka=0&"
//                    + "business=0&"
//                    + "seasons=0&"
//                    + "seasonYear=1&"
//                    + "technical=0&"
//                    + "filter=3&"
//                    + "exactFilter=0&"
//                    + "limit=10&"
//                    + "forceYear=0&"
//                    + "trailers=0&"
//                    + "movieTrivia=0&"
//                    + "awards=0&"
//                    + "moviePhotos=0&"
//                    + "movieVideos=0&"
//                    + "actors=0&"
//                    + "biography=0&"
//                    + "uniqueName=0&"
//                    + "filmography=0&"
//                    + "bornAndDead=0&"
//                    + "starSign=0&"
//                    + "actorActress=0&"
//                    + "actorTrivia=0&"
//                    + "similarMovies=0&"
//                    + "adultSearch=0&"
//                    + "goofs=0&"
//                    + "quotes=0&"
//                    + "fullSize=0&"
//                    + "companyCredits=0");                        //visit a url
//            
//            JNode movie = userAgent.json.findFirst("movies");
//            for (JNode jNode : movie) {
//                System.out.println(jNode.get("title")+" | " + jNode.get("year") + " | " + jNode.get("idIMDB"));
//                
//            }
            
            
            //System.out.println(userAgent.doc.innerHTML());
//            String vidLink = userAgent.doc.innerHTML().split("https://lh3.googleusercontent.com/")[1].split("=w600")[0];
//            System.out.println(vidLink);
//
//
//            URL obj = new URL("https://lh3.googleusercontent.com/" + vidLink + "=w72-h39-k-rw-no");
//            URLConnection conn = obj.openConnection();
//
//            String filename = conn.getHeaderField("content-disposition");
//            System.out.println(filename);

//            String vidLink2 = userAgent.doc.innerHTML().split(" data:function()")[1].split("\",")[0].split("\"")[1];
//            System.out.println(vidLink2);
//            
//            String singleLink = "http://photo.google.com/share/"+vidLink.split("\\?")[0]+"/photo/"+vidLink2+"?"+vidLink.split("\\?")[1];
//            System.out.println(singleLink);
        } catch (ResponseException ex) {
            Logger.getLogger(extractdirect.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
