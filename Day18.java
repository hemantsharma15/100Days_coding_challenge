package javaquestion;
import java.util.Scanner;

public class Day18 {
    
    public int countDigit(int n) {
        if (n == 0) return 1; // Special case: 0 has 1 digit
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        Day18 obj = new Day18();
        int res = obj.countDigit(n);
        System.out.println("Total digits: " + res);
        
        sc.close(); // Close the scanner
    }
}
