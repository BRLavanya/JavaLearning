package Basics;

public class StringConcatenation {

	public static void main(String[] args) 
	{
		int a =200;
		int b = 100;
		String x="hello";
		String y="world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+a+b+y);
		System.out.println(x+y+(a+b));
	}

}
