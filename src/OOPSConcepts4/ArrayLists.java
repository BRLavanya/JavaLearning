package OOPSConcepts4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");
	      System.out.println("invoking array lis object \n "+list);
	      
	      System.out.println("using for loop");
	      for(int i=0;i<list.size();i++)
	      {
	    	  System.out.print(list.get(i)+",");
	      }
	      System.out.println();
	      System.out.println("using iterator");
	     Iterator<String>it= list.iterator();
	     while (it.hasNext())
	     {
	    	 System.out.print(it.next()+",");
	     }
	     System.out.println();
	     System.out.println("using list iterator");
	     ListIterator<String>lt=list.listIterator(list.size());
	     while(lt.hasPrevious())
	     {
	    	 String str= lt.previous();
	    	 System.out.print(str+",");
	     }
	     System.out.println("");
	     
	     System.out.println("using for each ");
	     for(String obj: list)
	     {
	    	 System.out.print(obj+",");
	     }
	}
}
