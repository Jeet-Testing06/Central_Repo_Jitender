package practice_package;

public class ParameterConstructor
{
	public ParameterConstructor ()
	{
		this(10,20,30);
		System.out.println("This is default constructor");
	}
	public ParameterConstructor (int a)
	{
		this(40,50);
		System.out.println("This is one parameter constructor");
		System.out.println("Value of a is: "+a);
	}
	public ParameterConstructor (int a, int b)
	{
		this();
		System.out.println("This is two parameters constructor");
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}
	public ParameterConstructor (int a, int b, int c)
	{
		System.out.println("This is three parameters constructor");
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		System.out.println("Value of c is: "+c);
	}
	
	public static void main(String[] args)
	{
		ParameterConstructor ob = new ParameterConstructor(60);
	}	
}