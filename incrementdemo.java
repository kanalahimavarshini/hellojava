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