package OOPSConcepts3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleException 
{
public static void main(String[] args) 
{
	try
	{
		int i=10/0;
	}
	catch(ArrayIndexOutOfBoundsException|NullPointerException ex)
	{
	System.out.println("exception "+ex);	
	}
	catch (NumberFormatException e) {
		System.out.println("FileNotFoundException");
		System.out.println("exception is : "+e);
	}
	catch(IndexOutOfBoundsException i)
	{
		System.out.println("exception is : "+i);
	}
	
}
}
