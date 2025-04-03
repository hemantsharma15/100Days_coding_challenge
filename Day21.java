package javaquestion;
import java.util.Scanner;

public class Day21 
{
    // Function to find the minimum element in the array
    public int findMin(int arr[]) 
    {
        int min = Integer.MAX_VALUE;  // Initialize with the maximum possible value
        for (int i = 0; i < arr.length; i++)  
        {
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }
        return min;
    }

    // Function to find the maximum element in the array
    public int findMax(int arr[]) 
    {
        int max = Integer.MIN_VALUE;  // Initialize with the minimum possible value
        for (int i = 0; i < arr.length; i++)  
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        if (size == 0) 
        {
            System.out.println("Your array is empty");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        Day21 obj = new Day21();
        int minElement = obj.findMin(arr);
        int maxElement = obj.findMax(arr);

        System.out.println("Minimum element in the array is: " + minElement);
        System.out.println("Maximum element in the array is: " + maxElement);

        sc.close(); // Closing Scanner
    }
}
