import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create and populate the array
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));

        scanner.close();
    }
}
