package OOPSConcepts1;

public class A 
{
	public void a1()
	{
		System.out.println("a1 method");
		a3();

	}
	public final void a2()
	{
		System.out.println("a2 method");
		a3();
	}
	private final void a3()
	{
		System.out.println("a3");
	}
}
