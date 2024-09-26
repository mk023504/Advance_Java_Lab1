
import java.util.ArrayList;

public class ArrayListExample {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList  Time Insertion: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        arrayList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("ArrayList Time Search: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        arrayList.remove(new Integer(999999));
        endTime = System.nanoTime();
        System.out.println("ArrayList Time Deletion: " + (endTime - startTime) + " ns");
    }
}
