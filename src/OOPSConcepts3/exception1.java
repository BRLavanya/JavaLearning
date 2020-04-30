package OOPSConcepts3;

public class exception1
{
	public static void main(String[] args) 
	{
		int a[]= new int[2];
		try {
			System.out.println("inside try block");
			System.out.println("print the 3rd element "+a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("exception is "+e);
			e.printStackTrace();
			System.out.println("getMessage"+e.getMessage());
			System.out.println(e.toString());
		}
	}
}
