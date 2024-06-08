import java.lang.*;
import java.net.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println(isInternetAccessible());
     }
     public static boolean isInternetAccessible() {
            try {
                HttpURLConnection urlc = (HttpURLConnection) (new URL("http://www.google.com").openConnection());
                urlc.setRequestProperty("User-Agent", "Test");
                urlc.setRequestProperty("Connection", "close");
                urlc.setConnectTimeout(1500);
                urlc.connect();
                return (urlc.getResponseCode() == 200);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        
        
     }

}