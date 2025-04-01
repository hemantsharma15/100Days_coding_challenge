package javaquestion;
import java.util.Scanner;

public class Day19 {
    public int reverseArray(int arr[]) {
        // Edge case 1: If the array is empty
        if (arr.length == 0) {
            return -1; // Indicating empty array
        }
        // Edge case 2: If the array has only one element
        if (arr.length == 1) {
            return arr[0]; // Single element remains the same
        }

        // Reverse logic
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return 1; // Indicating successful reversal
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Day19 obj = new Day19();
        int result = obj.reverseArray(arr);

        if (result == -1) {
            System.out.println("Empty array, nothing to reverse.");
        } else if (result == 1) {
            System.out.println("Array after reverse:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Single element array, unchanged: " + result);
        }

        sc.close();
    }
}
