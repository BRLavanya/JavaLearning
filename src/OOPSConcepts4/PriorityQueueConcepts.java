package OOPSConcepts4;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcepts 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("tom");
		pq.add("jerry");
		pq.add("poppy");
//		pq.add(null);
//		pq.add(null);
		pq.add("dorman");
		pq.add("tom");
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		System.out.println("peek method: "+pq.peek());
		System.out.println("element method: "+pq.element());
		System.out.println("peek method: "+pq1.peek());
//		System.out.println("element method: "+pq1.element());
		
		pq.offer("hello");
		
		System.out.println("retrieve the elements");
		Iterator<String>it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("remove"+pq.remove());
		System.out.println("poll: "+pq.poll());
		System.out.println("after removing 2 elements");
		it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("poll: "+pq1.poll());
//		System.out.println("remove"+pq1.remove());
		System.out.println("removing specific object: "+pq.remove("tom"));
		System.out.println("removing specific object: "+pq.remove("xyz"));
		it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("removing specific object: "+pq1.remove("tom"));
		
	}
}
