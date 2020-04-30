package Programs;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int length= sc.nextInt();
		int a[] =new int[length];
		int sum=0;
		System.out.println("enter the array elements ");
		for(int i =0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array elements is");
		for(int j=0;j<length;j++)
		{
			System.out.print(a[j]+",");
		}
		for(int i=0;i<length;i++)
		{
			sum+=a[i];
		}
		System.out.println("\nsum of array is "+sum);
	}

}
