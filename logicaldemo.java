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