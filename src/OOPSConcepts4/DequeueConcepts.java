package OOPSConcepts4;

import java.util.ArrayDeque;

public class DequeueConcepts
{
	public static void main(String[] args)
	{
		ArrayDeque<String> ad= new ArrayDeque<String>();
		ad.add("tom");
		ad.addLast("maya");
		ad.add("jerry");
		ad.peekFirst();
		for (String str : ad)
		{  
			System.out.println(str);  
		}  
		System.out.println("************");
		ad.peekLast();
		for (String str : ad)
		{  
			System.out.println(str);  
		} 
	}
}
