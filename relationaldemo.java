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