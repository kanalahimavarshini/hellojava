import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);

    }

}
LinkedList<String> cities = new LinkedList<>();

cities.add("Delhi");
cities.add("Mumbai");
cities.add("Hyderabad");

System.out.println(cities);
HashSet<String> colors = new HashSet<>();

colors.add("Red");
colors.add("Blue");
colors.add("Green");

System.out.println(colors);
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll());
ArrayDeque<String> deque = new ArrayDeque<>();

deque.offer("A");
deque.offer("B");

System.out.println(deque.poll());
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println(fruits);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate
        fruits.add("Orange");

        System.out.println(fruits);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50); // Duplicate

        System.out.println(numbers);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println(queue.poll()); // Removes Alice
        System.out.println(queue.poll()); // Removes Bob
        System.out.println(queue.poll()); // Removes Charlie

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.offer("A");
        deque.offer("B");
        deque.offer("C");

        System.out.println(deque.poll());

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50); // Duplicate

        System.out.println(numbers);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println(students);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println(students.get(101));

        System.out.println(students.containsKey(102));

        System.out.println(students.size());

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println(students.get(101));
        System.out.println(students.get(105));

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println(students.containsKey(101));
        System.out.println(students.containsKey(105));

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(101, "Bob"); // Updates the value

        System.out.println(students);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println(students.containsValue("Alice"));
        System.out.println(students.containsValue("David"));

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");

        students.remove(101);

        System.out.println(students);

    }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map);

    }

}
try {

    int result = 10 / 0;

} catch (ArithmeticException e) {

    System.out.println("Cannot divide by zero.");

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Division by zero is not allowed.");

        }

        System.out.println("Program continues.");

    }

}
try {

    String s = null;

    System.out.println(s.length());

} catch (ArithmeticException e) {

    System.out.println("Math Error");

} catch (NullPointerException e) {

    System.out.println("Null Error");

}
public class Main {

    public static void main(String[] args) {

        throw new ArithmeticException("Invalid operation");

    }

}
import java.io.*;

public class Main {

    static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

    }

    public static void main(String[] args) {

        System.out.println("Method declared with throws.");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            System.out.println("Inside try");

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        } finally {

            System.out.println("Finally block executed.");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        int age = -5;

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        System.out.println("Valid age");

    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("data.txt");

        } catch (IOException e) {

            System.out.println("File not found.");

        }

    }

}
import java.io.*;

public class Main {

    static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

    }

    public static void main(String[] args) {

        System.out.println("Method declared with throws.");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program continues.");

    }

}
public class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0; // Exception occurs here

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

    }

}
public class Main {

    public static void main(String[] args) {

        int age = -1;

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        System.out.println("Valid age");

    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            File file = new File("data.txt");

            if (file.createNewFile()) {

                System.out.println("File created.");

            } else {

                System.out.println("File already exists.");

            }

        } catch (IOException e) {

            System.out.println("Error creating file.");

        }

    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello Java!");

            writer.close();

            System.out.println("Successfully written.");

        } catch (IOException e) {

            System.out.println("Write error.");

        }

    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("data.txt");

            int ch;

            while ((ch = reader.read()) != -1) {

                System.out.print((char) ch);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Read error.");

        }

    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Read error.");

        }

    }

}