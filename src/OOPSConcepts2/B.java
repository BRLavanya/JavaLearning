package OOPSConcepts2;

public class B  extends A{
	B()
	{
		System.out.println("B class constructor with no parameter");
	}
	B(int i)
	{
		System.out.println("B class constructor with 1 parameter "+i);
	}
	public B(int i,int j)
	{
		System.out.println("B class constructor with 2 parameter "+i +" "+j);
	}
	
}
