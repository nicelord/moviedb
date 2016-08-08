
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
            //create new userAgent (headless browser).
            userAgent.visit("https://goo.gl/photos/rxpq2qimBEZJctN47");                        //visit a url
            //System.out.println(userAgent.doc.innerHTML());
            String vidLink = userAgent.doc.innerHTML().split("https://lh3.googleusercontent.com/")[1].split("=w600")[0];
            System.out.println(vidLink);


            URL obj = new URL("https://lh3.googleusercontent.com/" + vidLink + "=w72-h39-k-rw-no");
            URLConnection conn = obj.openConnection();

            String filename = conn.getHeaderField("content-disposition");
            System.out.println(filename);

//            String vidLink2 = userAgent.doc.innerHTML().split(" data:function()")[1].split("\",")[0].split("\"")[1];
//            System.out.println(vidLink2);
//            
//            String singleLink = "http://photo.google.com/share/"+vidLink.split("\\?")[0]+"/photo/"+vidLink2+"?"+vidLink.split("\\?")[1];
//            System.out.println(singleLink);
        } catch (ResponseException ex) {
            Logger.getLogger(extractdirect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(extractdirect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(extractdirect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
