package javaquestion;

public class Day5 
{
  public static void main(String[] agrs)
  {
	  int num1=100;
	  int num2=200;
	  
	  System.out.println("Before swapping " + "num1 is "+ num1 + " num2 is "+ num2);
	  
	  num1=num1+num2;
	  num2=num1-num2;
	  num1=num1-num2;
	  
	  System.out.println("After swapping " + "num1 is "+ num1 + " num2 is "+ num2);

  }
}
