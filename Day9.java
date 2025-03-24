package javaquestion;
import java.util.Scanner;

public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input N from the user
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        int sum = 0;

        // Loop from 1 to N and add each number to sum
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);
        
        sc.close(); // Close the scanner
    }
}
