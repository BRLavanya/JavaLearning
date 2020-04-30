package Basics;

public class StringExample {
	public static void concatString(String s1)
	{
		System.out.println("string concatenation");
		s1=s1+"world";
	}
	public static void concatStringBuff(StringBuffer s2)
	{
		System.out.println("StringBuffer concatenation");
		s2=s2.append("world");
	}
	public static void concatStringBuil(StringBuilder s3)
	{
		System.out.println("StringBuilder concatenation");
		s3=s3.append("world");
	}
	public static void main(String[] args)
	{
		String s1="hello";
		StringBuffer s2 = new StringBuffer("hello");
		StringBuilder s3= new StringBuilder("hello");
		
		concatString(s1);
		System.out.println("the string is "+s1);
		
		concatStringBuff(s2);
		System.out.println("the string is "+s2);
		
		concatStringBuil(s3);
		System.out.println("the string is "+s3);
	}
}
