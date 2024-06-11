package main.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9000);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            if (str.equals("q")) {
                break;
            }
            System.out.println("Server say : " + dataInputStream.readUTF());
        }
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
        scanner.close();
    }
}
