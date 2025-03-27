package javaquestion;
import java.util.Scanner;

public class Day13 
{
    public int reverseNum(int n)
    {
    	  boolean isNegative = (n < 0); // Check if number is negative
          if (isNegative) {
              n = -n; // Convert negative to positive for processing
          }
        int reversed = 0;
        while (n != 0) 
        {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            n /= 10; // Remove the last digit from original number
        }
        return reversed;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        Day13 obj = new Day13();
        int reversedNum = obj.reverseNum(num);
        
        System.out.println("Reversed Number: " + reversedNum);
        
        sc.close(); // Close the scanner
    }
}
