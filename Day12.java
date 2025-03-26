package javaquestion;
import java.util.Scanner;

public class Day12 { 
    
    // Method to check if a given year is a leap year
    public boolean isLeapYear(int year) { 
        // A year is a leap year if:
        // - It is divisible by 4 AND not divisible by 100 OR
        // - It is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: "); 

        int year = sc.nextInt(); 
        
        // Creating an object to call the isLeapYear() method
        Day12 obj = new Day12(); 
        boolean res = obj.isLeapYear(year); 

        System.out.println("Is Leap Year? " + res); 
        
        sc.close(); // Closing Scanner to prevent resource leak
    }
}
