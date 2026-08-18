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
class Person {

    void display() {
        System.out.println("I am a Person");
    }

}
class Student extends Person {

    void study() {
        System.out.println("Student is studying");
    }

}
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();

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

class Puppy extends Dog {

    void weep() {
        System.out.println("Weeping");
    }

}

public class Main {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();

    }

}
class Animal {

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Bark");
    }

}

class Cat extends Animal {

    void meow() {
        System.out.println("Meow");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();

    }

}
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }

}
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }

}
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }

}
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

    }

}
class Animal {

    String name = "Animal";

}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        System.out.println(name);
        System.out.println(super.name);

    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();

    }

}