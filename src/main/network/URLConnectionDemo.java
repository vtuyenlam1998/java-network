package main.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://trungtamjava.com/khoa-hoc-java-co-ban/");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        int i = inputStream.read();
        while (i != -1) {
            System.out.print((char) i);
            i = inputStream.read();
        }
    }
}
