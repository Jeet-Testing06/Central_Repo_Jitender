package practice_package;

public class Class1
{
	int a;
	public void display()
	{
		System.out.println("This is display mehtod");
	}
	
	public static void main(String[] args)
	{
		Class1 ob = new Class1();
		ob.display();
		int b = ob.a = 10;
		System.out.println("Value of a is: "+b);
		ob.display();
		int c = ob.a = 11;
		System.out.println("Change value of a is: "+c);
		ob.display();
	}
}