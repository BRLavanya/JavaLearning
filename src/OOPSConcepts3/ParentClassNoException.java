package OOPSConcepts3;

import java.io.IOException;

public class ParentClassNoException 
{
	public void sum()
	{
		System.out.println("hello parent");
	}
}

class child extends ParentClassNoException
{
	public void sum() throws RuntimeException
	{
		System.out.println("hello child");
	}
}

