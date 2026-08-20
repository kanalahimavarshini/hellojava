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