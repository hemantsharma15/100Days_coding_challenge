package javaquestion;

public class Day6 
{
	public void add(int a , int b)
	{
		int sum=a+b;
		System.out.println(sum+" is sum of a and b ");
	}
	
	public void add(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println(sum+" is sum of a , b and c ");

	}
	
	public void add(int a, int b, int c, int d)
	{
		int sum=a+b+c+d;
		System.out.println(sum+" is sum of a , b , c and d ");

	}
    public static void main(String agrs[])
    {
    	Day6 obj = new Day6();
    	obj.add(10, 10);
    	obj.add(10, 10, 10);
    	obj.add(10, 10,10,10);
    }
}
