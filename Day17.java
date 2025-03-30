package javaquestion;
import java.util.Scanner;

public class Day17
{
    public boolean isPerfectRoot(int n)
    {
       // double res = Math.sqrt(n);
       double res = Math.pow(n, 0.5); // Calculate square root
       return res == (int) res; // Check if it is a whole number
    	
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        Day17 obj = new Day17();
        if(obj.isPerfectRoot(num))
        {
            System.out.println(num + " is a perfect square.");
        }
        else
        {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
