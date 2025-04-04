package javaquestion;
import java.util.Scanner;
public class Day22{
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the size:");
    	int size=sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter "+size+" in the array");
        for(int i=0;i<size;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int result = findSecondLargest(arr);
        
        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + result);
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
