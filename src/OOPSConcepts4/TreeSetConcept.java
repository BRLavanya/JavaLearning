package OOPSConcepts4;

import java.util.TreeSet;

public class TreeSetConcept 
{
	public static void main(String[] args) 
	{
		TreeSet<String> set= new TreeSet<String>();
		 set.add("Ravi");  
         set.add("Vijay");  
         set.add("Arun");  
         set.add("Sumit");
         System.out.println(set);
         System.out.println("first element: "+set.first());
         System.out.println("last element: "+set.last());
         System.out.println(set.contains("Ravi"));
         System.out.println("reverse set "+set.descendingSet());
         System.out.println("subset "+set.subSet("Arun", "Sumit"));
	}
}
