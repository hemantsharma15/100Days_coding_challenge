package javaquestion; // Package declaration

import java.util.Arrays; // Import Arrays class for sorting

public class Day8 {
    public static void main(String args[]) { // Corrected "agrs" to "args"
        
        // Define an array with duplicate elements
        int arr[] = {11, 11, 23, 55, 55, 23, 10};

        // Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("After sorting the array: " + Arrays.toString(arr));

        int max = arr[arr.length - 1]; // Initialize max with the largest element
        int count = 1; // Counter to track unique elements

        // Loop through the array from the second last element to the first
        for (int i = arr.length - 2; i >= 0; i--) {
            // Check if the current element is different from the next one
            if (arr[i] != arr[i + 1]) {
                count++; // Increment the unique element count
                max = arr[i]; // Update max with the new unique element
            }

            // If we found the third unique largest element
            if (count == 3) {
                System.out.println(max + " is the third largest element.");
                break;
            }
        }

        // If there are less than three unique elements
        if (count < 3) {
            System.out.println("The third largest number is not present in the array.");
        }
    }
}
