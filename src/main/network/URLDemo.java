package main.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://idrsoft.com/");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getFile());
    }
}
