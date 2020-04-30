package OOPSConcepts3;

import java.io.IOException;

public class ParentClassException
{
	public void sum() 
	{
		System.out.println("hello parent");
	}
}
class child1 extends ParentClassException
{
	public void sum() throws RuntimeException
	{
		System.out.println("hello child");
	}
}