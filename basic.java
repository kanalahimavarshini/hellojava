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
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {

        super.sound();

        System.out.println("Dog Bark");

    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }

}
class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }

}

class Dog extends Animal {

    Dog() {

        super();

        System.out.println("Dog Constructor");

    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

    }

}
interface Greeting {
    void sayHello();
}

Greeting g = new Greeting() {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

};
interface Add {
    int add(int a, int b);
}

public class Main {

    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        System.out.println(obj.add(10, 20));

    }

}
interface Square {
    int square(int n);
}

public class Main {

    public static void main(String[] args) {

        Square s = n -> n * n;

        System.out.println(s.square(5));

    }

}
@FunctionalInterface
interface Greeting {

    void sayHello();   // Only one abstract method

    default void welcome() {
        System.out.println("Welcome");
    }

    static void info() {
        System.out.println("Greeting Interface");
    }
}
@FunctionalInterface
interface Multiply {
    int multiply(int a, int b);
}

public class Main {

    public static void main(String[] args) {

        Multiply m = (a, b) -> a * b;

        System.out.println(m.multiply(5, 6));

    }

}
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));

    }

}
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(6));

    }

}
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String> print = name -> System.out.println(name);

        print.accept("Alice");

    }

}
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<String> message = () -> "Welcome!";

        System.out.println(message.get());

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println(name));

    }

}
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> check =
                s -> s.length() > 5;

        System.out.println(check.test("Java"));
        System.out.println(check.test("Programming"));

    }

}
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(8)); // true
        System.out.println(isEven.test(5)); // false

    }

}
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5));

    }

}
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<String> message = () -> "Welcome to Java!";

        System.out.println(message.get());

    }

}
List<Integer> numbers = Arrays.asList(2, 5, 8, 9, 10);

numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
       List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

Stream<String> stream = names.stream();
List<Integer> nums =
        Arrays.asList(10, 15, 20, 25, 30);

nums.stream()
    .filter(n -> n > 20)
    .forEach(System.out::println);
    List<String> names =
        Arrays.asList("java", "python", "c++");

names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
     List<Integer> nums =
        Arrays.asList(5, 2, 8, 1, 4);

nums.stream()
    .sorted()
    .forEach(System.out::println);
    import java.util.stream.Collectors;

List<Integer> result =
        nums.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

System.out.println(result);
List<String> names =
        Arrays.asList("alice", "bob", "charlie");

List<String> result =
        names.stream()
             .filter(name -> name.length() > 3)
             .map(String::toUpperCase)
             .sorted()
             .collect(Collectors.toList());

System.out.println(result);
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> squares =
                nums.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toList());

        System.out.println(squares);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
             .forEach(System.out::println);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

        nums.stream()
            .filter(n -> n > 20)
            .forEach(System.out::println);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "python", "c++");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        nums.stream()
            .map(n -> n * n)
            .forEach(System.out::println);

    }

}
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> evenNumbers = nums.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        int sum = nums.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Alice", "Bob", "Charlie");

        long total = names.stream().count();

        System.out.println(total);

    }

}