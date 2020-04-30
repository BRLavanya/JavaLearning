package Basics;

public class LoopConcepts {

	public static void main(String[] args) 
	{
		System.out.println("while loop: to print 1 to 5");
		int i=1; //initialization
		while (i<=5) //condition
		{
			System.out.println(i);
			i++; //increment or decrement
		}
		System.out.println("disadvantage of while loop is if we don't give increment or decrement then it will be come infite loop");
		
		System.out.println(" for loop to print 1 to 5");
		
		for(int j=1;j<=5;j++)
		{
			System.out.println(j);
		}
	}

}
