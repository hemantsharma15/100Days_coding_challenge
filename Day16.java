package javaquestion;
import java.util.Scanner;

public class Day16 {
    public static int linearSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -2; // Return -2 if the array is empty
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Handle empty array case
        if (n == 0) {
            System.out.println("Array is empty. Cannot perform search.");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(arr, key);

        // Display result
        if (result == -2) {
            System.out.println("Array is empty.");
        } else if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
