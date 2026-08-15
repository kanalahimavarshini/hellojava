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