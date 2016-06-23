package moviedb;

import com.jaunt.Document;
import com.jaunt.HttpResponse;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PostProcess
        extends Thread {

    FormUtama fu;

    public PostProcess(FormUtama fu) {
        this.fu = fu;
    }

    @Override
    public void run() {
        fu.getProgress().setValue(0);
        fu.getProgress().setIndeterminate(true);
        try {
            this.fu.getTxtLog().append("\n\nCreating post : " + this.fu.getTxtPostURL().getText());
            this.fu.getTxtLog().append("\n");

            StringBuilder data = new StringBuilder();
            if (!this.fu.getTxtTitle().getText().isEmpty()) {
                data.append("title=").append(this.fu.getTxtTitle().getText()).append(" (").append(this.fu.getTxtYear().getText()).append(") ").append("[").append(this.fu.getCmbQuality().getSelectedItem().toString()).append(" ").append(this.fu.getCmbResolution().getSelectedItem().toString()).append("]");

                data.append("&ori_title=").append(this.fu.getTxtTitle().getText());
                data.append("&imdbID=").append(this.fu.getTxtIMDUrl().getText());
            }
            if (!this.fu.getTxtPlot().getText().isEmpty()) {
                data.append("&content=").append(this.fu.getTxtPlot().getText());
            }
            if (!this.fu.getTxtKeywords().getText().isEmpty()) {
                data.append("&keywords=").append(this.fu.getTxtKeywords().getText());
            }
            if (!this.fu.getTxtCountries().getText().isEmpty()) {
                data.append("&country=").append(this.fu.getTxtCountries().getText());
            }
            if (!this.fu.getTxtGenres().getText().isEmpty()) {
                data.append("&genres=").append(this.fu.getTxtGenres().getText());
            }
            if (!this.fu.getTxtYear().getText().isEmpty()) {
                data.append("&year=").append(this.fu.getTxtYear().getText());
            }
            if (!this.fu.getTxtDirectors().getText().isEmpty()) {
                data.append("&directors=").append(this.fu.getTxtDirectors().getText());
            }
            if (!this.fu.getTxtCast().getText().isEmpty()) {
                data.append("&actors=").append(this.fu.getTxtCast().getText());
            }
            if (!this.fu.getTxtWriter().getText().isEmpty()) {
                data.append("&writers=").append(this.fu.getTxtWriter().getText());
            }
            if (!this.fu.getTxtRuntime().getText().isEmpty()) {
                data.append("&runtime=").append(this.fu.getTxtRuntime().getText());
            }
            if (!this.fu.getCmbQuality().getSelectedItem().toString().isEmpty()) {
                data.append("&quality=").append(this.fu.getCmbQuality().getSelectedItem().toString());
            }
            if (!this.fu.getCmbResolution().getSelectedItem().toString().isEmpty()) {
                data.append("&resolution=").append(this.fu.getCmbResolution().getSelectedItem().toString());
            }
            if (!this.fu.getTxtDownlink().getText().isEmpty()) {
                data.append("&downlink=").append(this.fu.getTxtDownlink().getText());
            }
            if (!this.fu.getTxtPoster().getText().isEmpty()) {
                data.append("&poster=").append(this.fu.getTxtPoster().getText());
            }
            if (!this.fu.getTxtThrailer().getText().isEmpty()) {
                data.append("&trailer=").append("https://www.youtube.com/embed/").append((this.fu.getTxtThrailer().getText().replace(",", "")).trim());
            } else {
                data.append("&trailer=default");
            }
//            if (!this.fu.getTxtDirectLink().getText().isEmpty()) {
//                data.append("&directstream=").append(this.fu.getTxtDirectLink().getText());
//            }
            if (!this.fu.getTxtStreamCode().getText().isEmpty()) {
                data.append("&embedstream=").append(this.fu.getTxtStreamCode().getText().replace("&", "%26"));
            }
            if (!this.fu.getTxtFileSize().getText().isEmpty()) {
                data.append("&size=").append(this.fu.getTxtFileSize().getText()).append(this.fu.getCmbSizeUnit().getSelectedItem().toString());
            }
            if (!this.fu.getTxtRating().getText().isEmpty()) {
                data.append("&rating=").append(this.fu.getTxtRating().getText());
            }
            switch (this.fu.getCmbPostStatus().getSelectedItem().toString()) {
                case "POST NOW":
                    data.append("&post_status=publish");
                    break;
                case "SCHEDULE":
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    data.append("&post_status=future&post_date=").append(sdf.format(this.fu.getSpinerDateTime().getValue()));
            }
            String postData = data.toString().replace("&amp;", "%26").replace("&amp;quot;", "\"");
            this.fu.getTxtLog().append(postData);
            this.fu.getTxtLog().append("\n");
            if (!postData.isEmpty()) {
                UserAgent userAgent = new UserAgent();
                userAgent.sendPOST(this.fu.getTxtPostURL().getText(), postData);
                this.fu.getTxtLog().append(userAgent.response.getMessage());
                this.fu.getTxtLog().append("\n");
                this.fu.getTxtLog().append(userAgent.doc.innerText());
                this.fu.getTxtLog().append("\n");
            }
        } catch (ResponseException ex) {
            this.fu.getTxtLog().append(ex.getMessage());
            this.fu.getTxtLog().append("\n");
            ex.printStackTrace();
        }
        
        fu.getProgress().setIndeterminate(false);
        fu.getProgress().setValue(100);
    }
}
