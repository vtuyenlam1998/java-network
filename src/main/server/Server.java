package main.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Bắt đầu mở cổng kết nối");
        ServerSocket serverSocket =  new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String str = dataInputStream.readUTF();
        System.out.println(str);
        dataInputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("Đóng cổng kết nối");
    }
}
