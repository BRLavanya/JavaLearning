package OOPSConcepts4;

import java.util.ArrayList;

public class ArrayListOperattions 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();  
        System.out.println("Initial list of elements: "+al);  
        //Adding elements to the end of the list  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ajay");
        System.out.println("after adding elements: "+al);
        System.out.println("adding element at specific position");
        al.set(0, "sanjay");
        System.out.println("after adding element at specific position: "+al);
        ArrayList<String> al2=new ArrayList<String>();  
        al2.add("Sonoo");  
        al2.add("Hanumat");
        System.out.println("adding al2 array list to al");
        al.addAll(al2);
        System.out.println(al);
        al.remove(3);
        System.out.println("to remove elements from a specific position "+al);
        System.out.println("checking if the array is empty: "+al.isEmpty());
        al.clear();
        System.out.println("checking if the array is empty:"+al.isEmpty());
	}
}
