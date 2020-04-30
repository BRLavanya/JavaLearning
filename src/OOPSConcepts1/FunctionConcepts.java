package OOPSConcepts1;

public class FunctionConcepts
{
	public static void main(String[] args)
	{
		FunctionConcepts f = new FunctionConcepts();
		f.method1();
		f.method2(3);
		System.out.println(f.method3(2));
		System.out.println(f.method4());
	}
	
	public void method1()
	{
		System.out.println("this method will not take any input parameter and will not return any value");
	}
	
	public void method2(int a)
	{
		System.out.println("this method will take any input parameter and will not return any value");
		System.out.println("value of a is "+a+"\n");

	}
	
	public int method3(int a)
	{
		System.out.println("this method will take input parameter and will return value");
		System.out.println("value of a is "+a+"\n");
		return a*a*a;

	}
	
	public int method4()
	{
		int a=4;
		System.out.println("this method will not take input parameter and will return value");
		return a*a*a;

	}
}
