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
import java.net.*;

public class Main {

    public static void main(String[] args) {

        try {

            InetAddress address =
                    InetAddress.getByName("google.com");

            System.out.println(address);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {

        try {

            InetAddress address =
                    InetAddress.getByName("google.com");

            System.out.println(address.getHostName());
            System.out.println(address.getHostAddress());

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}