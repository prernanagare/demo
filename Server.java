import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            Servant s = new Servant(); //remote object
            Naming.rebind("localhost", s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

	
