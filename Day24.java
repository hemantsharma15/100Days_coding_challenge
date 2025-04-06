package javaquestion;
import java.util.Scanner;

public class Day24 
{
    public void Fibonacci(int n)
    {
        int num1 = 0;
        int num2 = 1;

        System.out.print("Fibonacci of " + n + " terms is: ");

        // Handle edge cases
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        if (n == 1) {
            System.out.print(num1);
            return;
        }

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < n; i++) // already printed 2 terms
        {
            int res = num1 + num2;
            System.out.print(res + " ");
            num1 = num2;
            num2 = res;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");
        int num = sc.nextInt();

        Day24 obj = new Day24();
        obj.Fibonacci(num);

        sc.close();
    }
}
