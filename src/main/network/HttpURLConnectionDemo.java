package main.network;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://trungtamjava.com/khoa-hoc-java-co-ban/");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        for (int i = 0 ; i < httpURLConnection.getHeaderFields().size(); i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
        }
    }
}
