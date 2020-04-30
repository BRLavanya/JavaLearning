package Basics;

import java.util.Scanner;

public class IfElseConcepts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("enter the value of c");
		int c = sc.nextInt();
		System.out.println("largest of two numbers");
		if(a>b)
		{
			System.out.println(a+" is largest");
		}
		else if(b>a)
		{
			System.out.println(b+" is largest");
		}
		else if(b==a)
		{
			System.out.println("both are equal");
		}
		
		System.out.println("largest of three numbers");
		
		if(a>b && a>c)
		{
			System.out.println(a+" is largest");
		}
		else if (b>c)
		{
			System.out.println(b+" is largest");
		}
		else
		{
			System.out.println(c+" is largest");
		}
	}
}