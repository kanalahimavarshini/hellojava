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