package main.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress =  InetAddress.getByName("localhost");
        DatagramSocket datagramSocket = new DatagramSocket(9000,inetAddress);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket =  new DatagramPacket(buf,buf.length);
        datagramSocket.receive(datagramPacket);
        String str = new String(datagramPacket.getData(),0,buf.length);
        System.out.println(str);
        datagramSocket.close();
    }
}
