package main.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getByName("localhost");
        String str = "Xin chào các bạn K32";
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(),str.length(),inetAddress,9000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
