package javaquestion;
import java.util.Scanner;

public class Day20 
{
    public static int sumOfDigits(int number)  // Renamed for clarity and made static
    {
        int sum = 0;
        while (number != 0) 
        {
            sum += number % 10;  // Extract last digit and add to sum
            number /= 10;        // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Sum of digits: " + sumOfDigits(num));
        
        sc.close();  // Closing Scanner
    }
}
