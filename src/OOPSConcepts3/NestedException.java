package OOPSConcepts3;

public class NestedException {
	public static void main(String[] args) 
	{
		try{
			try{	
				System.out.println("going to divide by 0");
				int i =10/0;
				}
				catch (ArithmeticException e) {
					System.out.println("exception is : "+e);
				}
				try {
					System.out.println("array index out of bound");
					int a[]= new int[2];
					System.out.println(a[3]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("exception is : "+e);
				}
				System.out.println("code continues");
			}
			catch (Exception e) {
				System.out.println("exception handled");
			}
		System.out.println("code continues");
		
	}
}
