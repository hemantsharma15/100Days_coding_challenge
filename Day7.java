package javaquestion; // Package declaration

import java.util.Scanner; // Import Scanner for user input
import java.util.ArrayList; // Import ArrayList to store numbers

public class Day7 // Class definition
{
  public static void main(String agrs[]) // Main method
  {
      // Creating two ArrayLists: one for even numbers and one for odd numbers
	  ArrayList al1 = new ArrayList();
	  ArrayList al2 = new ArrayList();

	  Scanner sc = new Scanner(System.in); // Scanner object to take user input
	  System.out.print("Enter the size of where you want to check even or odd : ");
	  int size = sc.nextInt(); // Taking user input for size

	  // Loop from 1 to size-1
	  for(int i=1; i<size; i++)
	  {
		  if(i % 2 == 0) // Checking if the number is even
		  {
			  al1.add(i); // Adding even number to al1
		  }
		  else // If the number is odd
		  {
			  al2.add(i); // Adding odd number to al2
		  }
	  }
	  
	  // Printing even and odd numbers stored in ArrayLists
	  System.out.println(" Even no : " + al1);
	  System.out.println(" Odd no : " + al2);
  }
}

