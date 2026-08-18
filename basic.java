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
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();

    }

}
class Animal {

    String name = "Tom";

}

class Dog extends Animal {

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println(d.name);

    }

}
class Animal {

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();

    }

}
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }

}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Driving");
    }

}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.drive();

    }

}