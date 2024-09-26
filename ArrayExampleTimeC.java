public class ArrayExampleTimeC {
    public static void main(String[] args) {
        int[] array = new int[1000000];

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long endTime = System.nanoTime();
        System.out.println(" Time Taken in insertion of array: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 999999)
                break;
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken in search of array: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        array[999999] = 0;
        endTime = System.nanoTime();
        System.out.println("Time Taken in deletion of array: " + (endTime - startTime) + " ns");
    }
}