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