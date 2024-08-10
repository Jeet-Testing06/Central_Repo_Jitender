package practice_package;

public class C5A1
{
	public void method()
	{
		System.out.println("This is default method");
	}
	public void method1()
	{
		System.out.println("This is one parameterised method");
	}
	public void method2()
	{
		System.out.println("This is two parameterised method");
	}
	public void method3()
	{
		System.out.println("This is three parameterised method");
	}
	public void method4()
	{
		this.method3();
		this.method();
		this.method1();
		this.method2();
		System.out.println("This is four parameterised method");
	}
	
	public static void main(String[] args) 
	{
		C5A1 ob = new C5A1();
		ob.method4();
	}
}