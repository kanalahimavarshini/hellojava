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