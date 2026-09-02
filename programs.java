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
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {

        try {

            InetAddress local = InetAddress.getLocalHost();

            System.out.println("Host Name: " + local.getHostName());
            System.out.println("IP Address: " + local.getHostAddress());

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

            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

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

            System.out.println(address.getHostAddress());

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket("localhost", 5000);

            System.out.println("Connected!");

            socket.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {

            ServerSocket server =
                    new ServerSocket(5000);

            System.out.println("Waiting...");

            Socket client =
                    server.accept();

            System.out.println("Client Connected!");

            client.close();
            server.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
import java.io.OutputStream;
import java.net.Socket;

Socket socket =
        new Socket("localhost", 5000);

OutputStream out =
        socket.getOutputStream();

out.write("Hello".getBytes());

socket.close();
import java.io.InputStream;

InputStream in =
        client.getInputStream();

byte[] buffer = new byte[100];

int n = in.read(buffer);

System.out.println(
        new String(buffer, 0, n));
        ServerSocket server =
        new ServerSocket(5000);

Socket client =
        server.accept();

System.out.println("Connected");
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server!");

            socket.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

}