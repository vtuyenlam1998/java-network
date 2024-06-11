package main.RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    private static final long serialVersionUID = 1L;
    protected HelloImpl() throws RemoteException {
        super();
    }
    @Override
    public String hello(String name) throws RemoteException {
        System.out.println("Tôi tên là " + name);
        return "Xin chào " + name;
    }

    public static void main(String[] args) {
        try {
            Naming.bind("rmi://localhost:5000/hello", new HelloImpl());
            System.out.println("Server đã sẵn sàng");
        } catch (AlreadyBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }

    }
}
