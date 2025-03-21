package javaquestion;
import java.util.Scanner;

public class Day4 {
    // Instance variable to store user input
    int num;

    // Method to take user input
    void inputData() {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input
        System.out.print("Enter a number: ");
        num = sc.nextInt(); // Reading integer input from user
        // sc.close();  // (Optional) If you close here, you can't take input again in the same execution
    }

    // Method to check if the number is positive, negative, or zero
    public void isCheckNum() {
        if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println(num + " is a zero.");
        }
    }

    // Main method - Execution starts from here
    public static void main(String args[]) {
        Day4 obj = new Day4(); // Creating an object of the class
        obj.inputData(); // Calling method to take input
        obj.isCheckNum(); // Calling method to check the number
    }
}
