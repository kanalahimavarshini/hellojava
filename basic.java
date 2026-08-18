class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
class basic {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

    }
}
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {

}