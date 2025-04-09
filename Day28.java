package javaquestion;
import java.util.Scanner;

public class Day28 extends Car
{
	
 
	Day28(String model,double price)
	{
		super(model,price);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter model name:");
		String model=sc.next();
		System.out.print("enter the price of car:");
		double price=sc.nextDouble();
		Day28 obj = new Day28(model,price);
		obj.display();
	}
}
