class Student {
    public static void main(String[] args) {
        int age = 19;
        double height = 5.6;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Himavarshini";
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(grade);
        System.out.println(isStudent);
    }
}
try {

    // File operation

}
catch (IOException e) {

    System.out.println("An error occurred.");

}
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("test.txt");

            writer.write("Java File Handling");

            writer.close();

            System.out.println("Done");

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Hello Java!");

            writer.close();

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("student.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error reading file.");

        }

    }

}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(
                new FileReader("student.txt")
            );

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedWriter bw = new BufferedWriter(
                new FileWriter("student.txt")
            );

            bw.write("Welcome to Java");

            bw.close();

            System.out.println("Written");

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedWriter bw = new BufferedWriter(
                new FileWriter("notes.txt", true)
            );

            bw.write("Java Collections");
            bw.newLine();

            bw.close();

            System.out.println("Saved");

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("test.txt");

            writer.write("Hello Java");

            writer.close();

            System.out.println("Done");

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }

}

public class Main {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

    }

}
class MyTask implements Runnable {

    public void run() {
        System.out.println("Runnable thread");
    }

}

public class Main {

    public static void main(String[] args) {

        Thread t = new Thread(new MyTask());

        t.start();

    }

}