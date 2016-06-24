
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
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
            UserAgent userAgent = new UserAgent();                       //create new userAgent (headless browser).
            userAgent.visit("https://goo.gl/photos/XJ7Rit8yTmVEoy7S9");                        //visit a url
            String vidLink = userAgent.doc.innerHTML().split("property=\"og:image\" content=\"")[1].split("=")[0];
            System.out.println(vidLink);
            String maxRes = userAgent.doc.innerHTML().split(vidLink)[2].substring(2, 5);
            System.out.println(maxRes);
            String downloadLink = userAgent.doc.innerHTML().split("https://video.googleusercontent.com")[1].split("\",")[0];
            System.out.println("https://video.googleusercontent.com"+downloadLink);
            
        } catch (ResponseException ex) {
            Logger.getLogger(extractdirect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
