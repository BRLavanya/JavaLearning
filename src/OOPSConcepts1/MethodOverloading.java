package OOPSConcepts1;

public class MethodOverloading {

	public static void main(String[] args)
	{
		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum(0.3);
		m.sum(6.0f);
		m.sum(0.06f, 9);
	}
	
	public void sum()
	{
		System.out.println("sum 1");
	}
	public void sum(double d)
	{
		System.out.println("sum 2");
	}
	
	public int sum(float y,int z)
	{
		System.out.println("sum 3 ");
		return z;
	}
	
	
}
