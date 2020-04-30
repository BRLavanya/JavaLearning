package OOPSConcepts1;

public class CallByValueCallByReferences {

	int x,y;
	
	public static void main(String[] args) 
	{
		int a=5;
		int b=6;
		System.out.println("pass by value or call by value");
		CallByValueCallByReferences c= new CallByValueCallByReferences();
		c.sum(a, b);
		System.out.println("value of a is "+a+" value of b is "+b);
		System.out.println("pass by references or call by reference");
		c.x=10;
		c.y=15;
		System.out.println("value of x is "+c.x+" value of y is "+c.y);
		c.swap(c);
		System.out.println("value of x is "+c.x+" value of y is "+c.y);
	}
	
	public void sum(int a, int b)
	{
		System.out.println("sum of a,b is"+(a+b));
		a=6;
		b=7;
		System.out.println("sum of a,b is"+(a+b));
		System.out.println("value of a is "+a+" value of b is "+b);
	}
	
	public void swap(CallByValueCallByReferences c)
	{
		int temp = c.x;
		c.x=c.y;
		c.y=temp;
		System.out.println("value of x is "+c.x+" value of y is "+c.y);
	}
}
