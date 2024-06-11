package main.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = dataInputStream.readUTF();
            if (str.equals("q")) {
                break;
            }
            System.out.println("Client say " + str);
            String serverStr = scanner.nextLine();
            dataOutputStream.writeUTF(serverStr);
            dataOutputStream.flush();
        }
        dataInputStream.close();
        dataOutputStream.close();
        scanner.close();
        socket.close();
        serverSocket.close();
    }
}
