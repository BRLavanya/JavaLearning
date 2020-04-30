package OOPSConcepts2;

public abstract class Abstract1 {
	
	static int a;
	protected  int b;

	public abstract void gender();
	Abstract1(int i)
	{
		System.out.println("hello"+i);
	}
	
	public void parent()
	{
		System.out.println("parent class method");
	}
	
	public static final void msg()
	{
		System.out.println("static");
	}
	public final void fin()
	{
		System.out.println("final");
	}
}
