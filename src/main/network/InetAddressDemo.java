package main.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("google.com.vn");
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getAddress());
        System.out.println(inetAddress.getCanonicalHostName());
    }
}
