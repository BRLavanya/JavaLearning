package Basics;

public class StringBBToString
{
	public static void main(String[] args) 
	{
		StringBuilder sbl= new StringBuilder("hello");
		StringBuffer sbr= new StringBuffer("world");
		
		System.out.println("converting string buffer to string ");
		String str=sbr.toString();
		str=str+"world";
		
		System.out.println(str);
		
		System.out.println("converting string builder to string ");
		String st1=sbl.toString();
		st1=st1+"world";
		
		System.out.println(st1);
	}
}
