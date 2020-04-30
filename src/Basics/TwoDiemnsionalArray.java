package Basics;

public class TwoDiemnsionalArray 
{
	public static void main(String[] args) 
	{
		String s[][]= new String[2][3];
		System.out.println("the length of the row or x is "+s.length);
		System.out.println("the length of the column or y is "+s[0].length);
		s[0][0]="hi";
		s[0][1]="hello";
		s[0][2]="how";
		s[1][0]="are";
		s[1][1]="you";
		s[1][2]="tc";
		System.out.println("to print the array values is");
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[0].length;j++)
			{
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
		
		int a[][]= {{1,2,1},{4,5,1}};
		
		
	}
}
