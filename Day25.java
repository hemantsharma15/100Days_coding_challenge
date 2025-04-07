package javaquestion;
import java.util.Scanner;

public class Day25 {
    
    public int findGCD(int a, int b) {
    	
    	
    		if (b == 0)
                return a;
            else
                return findGCD(b, a % b);
    
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        Day25 obj = new Day25();
        int res = obj.findGCD(a, b);
        
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is: " + res);
        sc.close();
    }
}
