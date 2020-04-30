package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseStringUsingIterator 
{
	public static void main(String[] args) 
	{
		LinkedList<String>l = new LinkedList<String>();
		l.add("hi");
		l.add("how r u");
		l.add("bye");
		System.out.println(l);
		Iterator<String> i = l.descendingIterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
			
		}
	}
}
