package OOPSConcepts4;
import java.util.*;
public class LinkedListConcept 
{
	public static void main(String[] args) 
	{
		LinkedList<String> sl= new LinkedList<String>();
		sl.add("hello");
		sl.add("how r u");
		sl.add("?");
		System.out.println(sl);
		sl.addFirst("hiee");
		sl.addLast("bye");
		System.out.println(sl);
		System.out.println("value of 0 index: "+sl.get(0));
		sl.set(0, "tom");
		System.out.println("after seeting the index 0 with some othe value");
		System.out.println(sl);
		sl.removeFirst();
		sl.removeLast();
		System.out.println("after removing first and last element");
		System.out.println(sl);
		System.out.println("removing from a particular location");
		sl.remove("?");
		System.out.println(sl);
		System.out.println("how to iterate all the values of linked list");
		System.out.println("**********for loop************");
		for(int i=0;i<sl.size();i++)
		{
			System.out.print(sl.get(i)+",");
		}
		System.out.println("**********advanced for loop************");
		for(String str : sl)
		{
			System.out.println(str);
		}
		System.out.println("************using  iterator***************");
		Iterator<String>it=sl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("************using  list iterator***************");
		ListIterator<String>ll=sl.listIterator(sl.size());
		while(ll.hasPrevious())
		{
			System.out.println(ll.previous());
		}
	}
}
