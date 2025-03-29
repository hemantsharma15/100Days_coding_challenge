package javaquestion;  // Package declaration

import java.util.Scanner;  // Import Scanner class for user input

public class Day15 
{
    // Method to check if a number is an Armstrong number
    public boolean isArmstrong(int n)
    {
        int OriginalNum = n;  // Store the original number
        int sum = 0;  // Variable to store sum of digits raised to power
        int digits = String.valueOf(n).length();  // Count the number of digits in 'n'

        while(n > 0)  // Loop through each digit of the number
        {
            int digit = n % 10;  // Extract last digit
            sum += Math.pow(digit, digits);  // Add digit^d to sum
            n /= 10;  // Remove last digit
        }

        return OriginalNum == sum;  // Check if sum equals the original number
    }

    public static void main(String[] args)
    {
        Day15 obj = new Day15();  // Create an object of Day15 class
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        System.out.println("Enter a number:");  
        int num = sc.nextInt();  // Read input number

        // Check if the number is an Armstrong number
        if(obj.isArmstrong(num))
        {
            System.out.println(num + " is an Armstrong number");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number");
        }

        sc.close();  // Close the scanner to prevent resource leak
    }
}
