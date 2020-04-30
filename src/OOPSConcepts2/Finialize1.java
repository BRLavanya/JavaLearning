package OOPSConcepts2;

public class Finialize1 
{
	public void finalize()
	{
		System.out.println("finalize method");
	}
	public static void main(String[] args) 
	{
		Finialize1 s = new Finialize1();
		s=null;
		System.gc();
		System.out.println("main");
		s.finalize();
	}
	
}
