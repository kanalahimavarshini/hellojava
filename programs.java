import java.net.*;

public class Main {

    public static void main(String[] args) {

        try {

            InetAddress local =
                    InetAddress.getLocalHost();

            System.out.println(local);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}