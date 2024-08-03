package practice_package;

public class Class2
{
	public int sum (int a, int b)
	{
		int c = a + b;
		System.out.println("Addition of a and b is: "+c);
		return c;
	}
	public int sub (int a, int b)
	{
		int c = a - b;
		System.out.println("Subtraction of a and b is: "+c);
		return c;
	}
	public int mul (int a, int b)
	{
		int c = a * b;
		System.out.println("Multiplication of a and b is: "+c);
		return c;
	}
	public void div (int a, int b)
	{
		int c = a / b;
		System.out.println("Division of a and b is: "+c);
	}
	
	public static void main(String[] args)
	{
		Class2 ob = new Class2();
		int a = ob.sum(10, 2);
		int b = ob.mul(a, 2);
		int c = ob.sub(b, 2);
		int d = ob.mul(c, 2);
		ob.div(d, 2);
	}	
}