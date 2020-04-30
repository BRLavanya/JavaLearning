package OOPSConcepts2;

public class Finialize4 {
	public static void main(String[] args) 
    { 
		Finialize4 q = new Finialize4(); 
        q = null; 
  
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
    } 
  
    // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
        System.out.println(10 / 0); 
    } 
}
