List<String> names = new ArrayList<>();

names.add("Alice");
names.add("Bob");
names.add("Alice");

System.out.println(names);
ArrayList<String> names = new ArrayList<>();
names.add("Divya");
names.add("Riya");

System.out.println(names.get(1)); // Riya
class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int current = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maximum = Math.max(maximum, current);
        }

        System.out.println("Maximum Subarray Sum: " + maximum);
    }
}
// 1. Reverse a String
class Main {
    public static void main(String[] args) {
        String str = "Java";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);

        System.out.println(rev);
    }
}
// 2. Palindrome Number
class Main {
    public static void main(String[] args) {
        int n = 121, temp = n, rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(temp == rev);
    }
}
// 3. Prime Number
class Main {
    public static void main(String[] args) {
        int n = 29;
        boolean prime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime);
    }
}
// 4. Fibonacci Series
class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
// 5. Factorial using Recursion
class Main {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}