import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Time Taken in insertion: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        hashSet.contains(999999);
        endTime = System.nanoTime();
        System.out.println(" Time Taken in search: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        hashSet.remove(999999);
        endTime = System.nanoTime();
        System.out.println(" Time Taken in deletion: " + (endTime - startTime) + " ns");
    }
}
