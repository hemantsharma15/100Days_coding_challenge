package javaquestion;
import java.util.Scanner;

public class Day11 
{
    public boolean isPrime(int n) // Corrected method name
    {
        if (n <= 1) return false; // 1 is not prime
        if (n == 2) return true;  // 2 is prime

        for(int i = 2; i * i <= n; i++) // Optimized loop
        {
            if(n % i == 0)
            {
                return false; // Not prime
            }
        }
        return true; // Prime number
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close(); // Closing scanner to prevent memory leak

        Day11 obj = new Day11();
        boolean isPrime = obj.isPrime(num);
        
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
