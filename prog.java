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