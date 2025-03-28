package javaquestion;
import java.util.Scanner;

public class Day14 
{

	public boolean isPalindrome(int n)
	{
		int original=n;
		int res=0;
		while(n!=0)
		{
			int digit=n%10;
			res = res*10+digit;
			n=n/10;
		}
		return original==res;
		
	}
	public static void main(String[] args)
	{
		Day14 obj = new Day14();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		System.out.println(obj.isPalindrome(n));
	}
}
