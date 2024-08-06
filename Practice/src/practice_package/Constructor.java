package practice_package;

public class Constructor
{
	public Constructor ()
	{
		System.out.println("This is default constructor");
	}
	public Constructor (int a)
	{
		System.out.println("This is one parameter constructor");
		System.out.println("Value of a is: "+a);
	}
	public Constructor (int a, int b)
	{
		System.out.println("This is two parameters constructor");
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}
	public Constructor (int a, int b, int c)
	{
		System.out.println("This is three parameters constructor");
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		System.out.println("Value of c is: "+c);
	}
	
	public static void main(String[] args)
	{
		Constructor ob = new Constructor();
		Constructor ob1 = new Constructor(1);
		Constructor ob2 = new Constructor(1, 2);
		Constructor ob3 = new Constructor(1, 2, 3);
	}	
}