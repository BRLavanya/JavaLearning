package OOPSConcepts4;

import java.util.HashSet;

public class HashSetConcepts 
{
	public static void main(String[] args) {
		  HashSet<String> set=new HashSet<String>();  
          set.add("Ravi");  
          set.add("Vijay");  
          set.add("Arun");  
          set.add("Sumit");
          System.out.println(set);
          set.removeIf(str->str.contains("Ravi"));
          System.out.println(set);
	}
}
