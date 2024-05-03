import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        try {
            Scanner s = new Scanner(System.in);
            ServerInterface si = (ServerInterface) Naming.lookup("localhost");
            System.out.println("Enter first string : ");
            String first = s.nextLine();
            System.out.println("Enter second string : ");
            String second = s.nextLine();
            System.out.println("Concatenated String : " + si.concat(first, second));
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}