package javaquestion;
import java.util.Scanner;

public class Day23 {

    // Method to print multiplication table of a number
    public void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " × " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        
        Day23 obj = new Day23();
        obj.printTable(num);

        sc.close(); // Always good to close the scanner
    }
}
