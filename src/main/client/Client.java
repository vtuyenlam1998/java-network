package main.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client kết nối");
        Socket socket = new Socket("localhost",9000);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hello K32");
        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();
    }
}
