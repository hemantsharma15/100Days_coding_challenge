package javaquestion;  // ✅ Changed package name to lowercase (Standard Java convention)

import java.util.Scanner;  // Import Scanner for user input

public class Day2  // ✅ Class name follows PascalCase
{
    // Instance variables for storing numbers
    private int firstNumber, secondNumber;
    private Scanner sc;  // ✅ Scanner as an instance variable (to prevent closing issues)

    // Constructor to initialize Scanner
    public Day2() {
        sc = new Scanner(System.in);
    }

    // Method to take input from the user
    void inputData() 
    {
        System.out.print("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();
    }

    // Method to calculate and print the sum
    void sumFun() 
    {
        int sum = firstNumber + secondNumber;  // Compute sum
        System.out.println(sum + " is the sum of " + firstNumber + " and " + secondNumber);
    }

    // Closing Scanner method (for safety)
    void closeScanner() {
        sc.close();  // ✅ Close Scanner only at the end
    }

    // Main method (Standard format)
    public static void main(String[] args)  // ✅ Standard args format
    {
        Day2 obj = new Day2();  // ✅ Create an object of the class
        obj.inputData();  // ✅ Call input method
        obj.sumFun();  // ✅ Call sum method
        obj.closeScanner();  // ✅ Close Scanner at the end
    }
}
