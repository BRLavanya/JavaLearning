package OOPSConcepts4;

import java.util.*;
import java.util.Map.Entry;

public class MapConcepts 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map=new HashMap<Integer, String>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    Set set = map.entrySet();
	    Iterator it = set.iterator();
	    while (it.hasNext()) 
	    {
	    	Map.Entry entry = (Map.Entry)it.next();
	    	System.out.println(entry.getKey()+","+entry.getValue());
			
		}
	}
}
