package OOPSConcepts2;

public class Finialize2 
{
	public static void main(String[] args) 
    { 
		Finialize2 m = new Finialize2(); 
  
        // Calling finalize method Explicitly. 
        m.finalize(); 
        m.finalize(); 
        m = null; 
  
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
        m.finalize();
    } 
  
    // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    } 
}
