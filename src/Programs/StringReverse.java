package Programs;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str= sc.next();
		String temp = "";
		for(int i=str.length()-1; i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		System.out.println("reverse of the "+str+" is = "+temp);
		if(str.equals(temp))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
