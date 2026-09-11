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