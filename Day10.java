package javaquestion;

public class Day10 
{
    public String factorial(int sum, int n, String expression)
    {
        if(n == 1) // Base case
            return expression + "1 = " + sum; // Append last number and return result

        sum = sum * n; // Multiply the current number
        expression += n + " × "; // Append the multiplication step

        return factorial(sum, n - 1, expression); // Recursive call with updated values
    }

    public static void main(String[] args)
    {
        Day10 obj = new Day10();
        String result = obj.factorial(1, 5, ""); // Start with an empty expression
        System.out.println(result);
    }
}
