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
// 6. Second Largest Element
class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        System.out.println(second);
    }
}
// 7. Remove Duplicates using HashSet
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int n : arr)
            set.add(n);

        System.out.println(set);
    }
}
// 8. Character Frequency using HashMap
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        System.out.println(map);
    }
}
// 9. Maximum Subarray Sum
class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int current = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maximum = Math.max(maximum, current);
        }

        System.out.println(maximum);
    }
}
// 10. Binary Search
class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;

        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
Set<Integer> nums = new HashSet<>();

nums.add(10);
nums.add(20);
nums.add(10);

System.out.println(nums);
TreeSet<Integer> nums = new TreeSet<>();

nums.add(30);
nums.add(10);
nums.add(20);

System.out.println(nums);
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);

System.out.println(set.contains(10)); // true
set.remove(20);
System.out.println(set.size());        // 1
Set<Integer> set = new HashSet<>();
set.add(10);
set.add(10);
// 11. Anagram Check
import java.util.*;

class Main {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x, y));
    }
}