package OOPSConcepts2;

public class FinalMain 
{
	public static void main(String[] args) 
	{
		FinalParent f1= new FinalParent(10, 50);
		System.out.println(f1.i);
		f1.j=5;
		System.out.println(f1.i);

	}
}
