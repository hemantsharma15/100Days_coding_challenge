package javaquestion;

import java.util.Scanner;

public class Day3 
{
	int num;
	public void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		num=sc.nextInt();
	}
	public Boolean isOdd()
	{
		return num%2==0;
	}
    public static void main(String[] agrs)
    {
    	Day3 obj = new Day3();
    	obj.inputData();
    	boolean res=obj.isOdd();
    	System.out.println(res);
    }
}
