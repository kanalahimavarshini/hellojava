class relationaldemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
class StudentNames {
    public static void main(String[] args) {

        String[] students = {
            "Divya",
            "Rahul",
            "Anu",
            "Kiran"
        };

        for (String student : students) {
            System.out.println(student);
        }
    }
}
class Demo {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
        greet();
    }
}
class Demo {

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        greet("Divya");
        greet("Rahul");
        greet("Anu");

    }
}
class Demo {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        add(10, 20);
        add(5, 7);
        add(100, 50);

    }
}
static void student(String name, int age) {
    System.out.println(name + " is " + age + " years old.");
}
class Square {

    static void square(int num) {
        System.out.println(num * num);
    }

    public static void main(String[] args) {

        square(5);
        square(8);
        square(12);

    }
}
class Demo {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);

    }
}
class Demo {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        int x = square(5);

        System.out.println(x);

    }
}
class Demo {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int total = add(10, 20);

        System.out.println(total * 2);

    }
}
class Demo {

    static String greet(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {

        String message = greet("Divya");

        System.out.println(message);

    }
}
class Cube {

    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {

        int answer = cube(4);

        System.out.println(answer);

    }
}
class Demo {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        add(10, 20);
        add(10, 20, 30);

    }
}
class Demo {

    static void display(int num) {
        System.out.println("Integer: " + num);
    }

    static void display(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {

        display(100);
        display("Hello");

    }
}
class Calculator {

    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        System.out.println(multiply(4, 5));
        System.out.println(multiply(2, 3, 4));

    }
}
class Area {

    static int area(int side) {
        return side * side;
    }

    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(area(4, 6));

    }
}
class Student {

    String name;
    int age;

}
class Student {

    String name;
    int age;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

    }

}
s1.name = "Divya";
s1.age = 21;
System.out.println(s1.name);
System.out.println(s1.age);
class Student {

    String name;
    int age;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Divya";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
class Student {

    String name;
    int age;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Divya";
        s1.age = 21;

        s2.name = "Rahul";
        s2.age = 22;

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);

    }
}
class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

}
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Divya";
        s1.age = 21;

        s1.display();

    }

}
class Student {

    Student() {
        System.out.println("Student Object Created");
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

    }

}
class Student {

    String name;
    int age;

    Student() {

        name = "Unknown";
        age = 18;

    }

    void display() {

        System.out.println(name);
        System.out.println(age);

    }

}
class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;

    }

    void display() {

        System.out.println(name);
        System.out.println(age);

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Divya", 21);

        s1.display();

    }

}
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println(name);
        System.out.println(age);

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Divya", 21);

        s1.display();

    }

}
class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Divya", 21);

        s1.display();
        s2.display();
    }
}
class Student {

    String name;
    int age;

    Student() {
        this("Unknown", 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();

    }
}
class Box {

    int length;
    int width;

    Box() {
        this(10, 20);
    }

    Box(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println(length + " " + width);
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.display();
    }
}
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("sample.txt");

        System.out.println(path);

    }

}