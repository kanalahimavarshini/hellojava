class LogicalDemo {
    public static void main(String[] args) {

        int age = 20;

        System.out.println(age > 18 && age < 25);
        System.out.println(age > 18 || age < 10);

        boolean isStudent = true;
        System.out.println(!isStudent);
    }
}
class IfDemo {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        System.out.println("Program Ended");
    }
}
class IfDemo {
    public static void main(String[] args) {

        int age = 15;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        System.out.println("Program Ended");
    }
}
class Eligibility {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 35) {
            System.out.println("Pass");
        }

        System.out.println("Exam Finished");
    }
}
class Vote {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
class Vote {
    public static void main(String[] args) {

        int age = 15;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
class PassFail {
    public static void main(String[] args) {

        int marks = 32;

        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
class NumberCheck {
    public static void main(String[] args) {

        int number = 8;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
class Grade {
    public static void main(String[] args) {

        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
class Temperature {
    public static void main(String[] args) {

        int temp = 32;

        if (temp >= 40) {
            System.out.println("Very Hot");
        } else if (temp >= 30) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
class NestedIfDemo {
    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        if (age >= 18) {

            if (hasID) {
                System.out.println("Entry Allowed");
            }

        }
    }
}
class Login {
    public static void main(String[] args) {

        String username = "admin";
        String password = "java123";

        if (username.equals("admin")) {

            if (password.equals("java123")) {
                System.out.println("Login Successful");
            }

        }
    }
}
class Admission {
    public static void main(String[] args) {

        int marks = 85;
        boolean documentsVerified = true;

        if (marks >= 75) {

            if (documentsVerified) {
                System.out.println("Admission Confirmed");
            }

        }
    }
}
class ArrayDemo {
    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 65, 88};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
    }
}
class Fruits {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
    }
}
import java.util.Scanner;

class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks entered:");

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}
class Numbers {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
import java.util.Scanner;

class MiniExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Take input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("You entered:");

        // Print the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
class ArraySum {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}
class LargestElement {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 80, 45, 60};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }

        System.out.println("Largest = " + largest);
    }
}
class SmallestElement {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 80, 45, 60};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        System.out.println("Smallest = " + smallest);
    }
}
class ArrayPractice {
    public static void main(String[] args) {

        int[] marks = {70, 85, 90, 60, 95};

        // Find Sum
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // Find Largest
        int largest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > largest) {
                largest = marks[i];
            }
        }

        // Find Smallest
        int smallest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < smallest) {
                smallest = marks[i];
            }
        }

        // Print Results
        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
class ForEachDemo {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
class Fruits {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Mango"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
class SumExample {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
abstract class Animal {

    abstract void sound();

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }

}
abstract class Shape {

    abstract void draw();

    void display() {
        System.out.println("Drawing Shape");
    }

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

}

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
        c.display();

    }

}
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle Stopped");
    }

}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike Started");
    }

}

public class Main {

    public static void main(String[] args) {

        Bike b = new Bike();

        b.start();
        b.stop();

    }

}
interface Animal {

    void sound();

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

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
        System.out.println("Dog is eating");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.play();

    }

}
interface Printable {

    void print();

}

class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing Report");
    }

}

public class Main {

    public static void main(String[] args) {

        Printable p = new Report();

        p.print();

    }

}
abstract class Animal {

    abstract void sound();

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }

}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

    }

}