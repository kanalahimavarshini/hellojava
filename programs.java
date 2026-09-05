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
import java.io.*;

class Student implements Serializable {

    int id = 101;
    String name = "Alice";

}

public class Main {

    public static void main(String[] args) {

        try {

            Student s = new Student();

            ObjectOutputStream out =
                    new ObjectOutputStream(
                        new FileOutputStream("student.ser"));

            out.writeObject(s);

            out.close();

            System.out.println("Object Saved");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
import java.io.*;

class Student implements Serializable {

    int id;
    String name;

}

public class Main {

    public static void main(String[] args) {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(
                        new FileInputStream("student.ser"));

            Student s = (Student) in.readObject();

            in.close();

            System.out.println(s.id);
            System.out.println(s.name);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
import java.io.*;

class Student implements Serializable {

    int id = 101;
    String name = "Alice";

}

public class Main {

    public static void main(String[] args) {

        try {

            Student student = new Student();

            ObjectOutputStream out =
                    new ObjectOutputStream(
                        new FileOutputStream("student.ser"));

            out.writeObject(student);

            out.close();

            System.out.println("Object Serialized Successfully!");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
import java.io.*;

class Student implements Serializable {

    int id = 101;
    String name = "Alice";

}

public class Main {

    public static void main(String[] args) {

        try {

            Student student = new Student();

            ObjectOutputStream out =
                    new ObjectOutputStream(
                        new FileOutputStream("student.ser"));

            out.writeObject(student);

            out.close();

            System.out.println("Object Serialized!");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

    transient String password;

}
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

System.out.println(list.get(0));

list.set(1, "C");

System.out.println(list);
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Alice");

        System.out.println(names);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println(languages);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("C");

        list.add(1, "B");

        System.out.println(list);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println(students);

    }

}
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");
list.add("C++");

for (String lang : list) {

    System.out.println(lang);

}
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "Alice");
map.put(2, "Bob");

for (Integer key : map.keySet()) {

    System.out.println(key + " -> " + map.get(key));

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Charlie");
        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println(students);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        for (String language : languages) {

            System.out.println(language);

        }

    }

}
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
class Pair<K, V> {

    private K key;
    private V value;

    Pair(K key, V value) {

        this.key = key;
        this.value = value;

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
public class Main {

    public static <T> void print(T value) {

        System.out.println(value);

    }

    public static void main(String[] args) {

        print("Java");
        print(100);
        print(3.14);

    }

}
class Calculator<T extends Number> {

    private T number;

    Calculator(T number) {

        this.number = number;

    }

    double square() {

        return number.doubleValue() * number.doubleValue();

    }

}
class Calculator<T extends Number> {

    private T number;

    Calculator(T number) {
        this.number = number;
    }

    double square() {
        return number.doubleValue() * number.doubleValue();
    }

}
import java.util.*;

public class Main {

    static void printNumbers(List<? extends Number> list) {

        for (Number n : list) {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        printNumbers(integers);
        printNumbers(doubles);

    }

}
public class Main {

    public static <T> void print(T value) {

        System.out.println(value);

    }

    public static void main(String[] args) {

        print("Java");
        print(100);
        print(3.14);
        print(true);

    }

}
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println(students);

    }

}
class Calculator<T extends Number> {

    private T number;

    Calculator(T number) {
        this.number = number;
    }

    double square() {
        return number.doubleValue() * number.doubleValue();
    }

}
public class Main {

    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        print("Java");
        print(100);
        print(3.14);
        print(true);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<? super Integer> list = new ArrayList<Number>();

        list.add(10);
        list.add(20);

        System.out.println(list);

    }

}
public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println(a / b);

        System.out.println("Program End");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program continues...");

    }

}
try {

    int[] numbers = {1, 2, 3};

    System.out.println(numbers[5]);

} catch (ArithmeticException e) {

    System.out.println("Arithmetic Error");

} catch (ArrayIndexOutOfBoundsException e) {

    System.out.println("Invalid index");

}
public class Main {

    static void checkAge(int age) {

        if (age < 18) {

            throw new ArithmeticException("Not eligible");

        }

        System.out.println("Eligible");

    }

    public static void main(String[] args) {

        checkAge(15);

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program continues.");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 2;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Error");

        } finally {

            System.out.println("Finally block executed.");

        }

    }

}
public class Main {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        checkAge(15);

    }

}
public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println(a / b); // Throws ArithmeticException

        System.out.println("Program End");

    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

    }

}
public class Main {

    static void validateAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        validateAge(15);

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        } finally {

            System.out.println("Cleanup completed.");

        }

    }

}