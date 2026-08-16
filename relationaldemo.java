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