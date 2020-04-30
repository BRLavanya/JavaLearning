package OOPSConcepts2;

public class Finally 
{
	public static void main(String[] args) 
	{
		m1();
		m2();
	}
	public static void m1() 
	{
		try {
			System.out.println("hello");
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally {
			System.out.println("m1 finally");
		}
	}
	
	public static void m2() 
	{
		try {
			System.out.println("hello m2");
		}
		catch(Exception e)
		{
			System.out.println("catch m2");
		}
		finally {
			System.out.println("m2 finally");
		}
	}
}
