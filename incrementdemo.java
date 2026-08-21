class incrementdemo {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(x);

        x++;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);
    }
}
class incrementdemo {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(x++);
        System.out.println(x);

        x = 10;

        System.out.println(++x);
        System.out.println(x);
    }
}
interface Animal {

    void sound();

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Bark");
    }

}
interface Animal {

    void sound();

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog");
    }

}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

    }

}
interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog");
    }
}

Animal a = new Dog();
a.sound();
abstract class Shape {

    abstract void draw();

    void display() {
        System.out.println("Shape");
    }

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Circle");
    }

}

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
        c.display();

    }

}
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }

}
interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

}
interface Printer {

    void print();

}

class Report implements Printer {

    @Override
    public void print() {
        System.out.println("Report");
    }

}

public class Main {

    public static void main(String[] args) {

        Printer p = new Report();

        p.print();

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            System.out.println(a / b);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program Continues...");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int[] arr = {10,20,30};

            System.out.println(arr[5]);

        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Array Index");

        }

        System.out.println("Finished");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[5]);

            int x = 10 / 0;

        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Error");

        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic Error");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int x = 10 / 0;

        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic Error");

        }

        finally {

            System.out.println("Finally Block Executed");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            System.out.println("Hello");

        }

        catch(Exception e) {

            System.out.println("Error");

        }

        finally {

            System.out.println("Always Executes");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            String str = null;

            System.out.println(str.length());

        }

        catch(NullPointerException e) {

            System.out.println("String is null.");

        }

        finally {

            System.out.println("Program Finished");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int x = 20 / 0;

        }

        catch(ArithmeticException e) {

            System.out.println("Error");

        }

        finally {

            System.out.println("Done");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        }

        System.out.println("Eligible");

    }

}
import java.io.IOException;

public class Main {

    static void readFile() throws IOException {

        throw new IOException("File not found");

    }

    public static void main(String[] args) {

        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            String s = null;

            System.out.println(s.length());

        }

        catch (NullPointerException e) {

            System.out.println("Null Error");

        }

        finally {

            System.out.println("End");

        }

    }

}
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }

}

public class Main {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Eligible to vote");

    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

}
public class Main {

    static void divide(int a, int b) {

        try {

            System.out.println(a / b);

        }

        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }

        finally {

            System.out.println("Division Completed");

        }

    }

    public static void main(String[] args) {

        divide(20, 0);
        divide(20, 5);

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.set(1, 25);

        for (int num : numbers) {
            System.out.println(num);
        }

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list.get(0));

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.remove(1);

        System.out.println(numbers);

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        list.set(1, "Orange");

        System.out.println(list);

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println(list.size());

    }

}
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");

        System.out.println(list.contains("Java"));
    }

}
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");

        System.out.println(cities);

    }

}
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);

    }

}