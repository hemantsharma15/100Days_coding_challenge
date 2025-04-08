package javaquestion;
import java.util.Scanner;

public class Day27 
{
    public int removeDuplicate(int arr[]) 
    {
        int n = arr.length;
        if (n == 0 || n == 1)
            return n;

        // First sort the array (required for this method)
        java.util.Arrays.sort(arr);

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) 
        {
            if (arr[i] != arr[i + 1]) 
            {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];  // add the last element

        // Copy back to original array
        for (int i = 0; i < j; i++) 
        {
            arr[i] = temp[i];
        }

        return j; // new size of array without duplicates
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements in the array: ");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        Day27 obj = new Day27();
        int newSize = obj.removeDuplicate(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
