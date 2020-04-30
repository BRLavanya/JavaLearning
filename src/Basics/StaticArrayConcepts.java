package Basics;

public class StaticArrayConcepts
{
	public static void main(String[] args) 
	{
		System.out.println("Array: to store similar data types values in a variable");
		
		System.out.println("integer array");
		 int i[]=new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 System.out.println("length of the array is "+i.length);
		 //	i[4]=50; array index out of bound exception
		 System.out.println(i[2]);
		 
		 System.out.println(" to print all the values of array");
		 for(int j=0;j<i.length;j++)
		 {
			 System.out.println(i[j]);
		 }
		 System.out.println("************************");
		 System.out.println("Character array");
		 char c[]=new char[3];
		 c[0]='A';
		 c[1]='$';
		 c[2]='5';
		 System.out.println(" to print all the values of array");
		 for(int d=0;d<c.length;d++)
		 {
			 System.out.println(c[d]);
		 }
		 System.out.println("************************");
		 System.out.println("Double array");
		 double f[]=new double[3];
		 f[0]=85.996;
		 f[1]=56.66;
		 f[2]=50.22;
		 System.out.println(" to print all the values of array");
		 for(int g=0;g<f.length;g++)
		 {
			 System.out.println(f[g]);
		 }
		 System.out.println("************************");
		 System.out.println("string array");
		 String h[]=new String[3];
		 h[0]="hi";
		 h[1]="hello";
		 h[2]="bye";
		 System.out.println(" to print all the values of array");
		 for(int k=0;k<h.length;k++)
		 {
			 System.out.println(h[k]);
		 }
		 
		 System.out.println("************************");
		 System.out.println("object array");
		 Object ob[]=new Object[5];
		 ob[0]=10;
		 ob[1]='a';
		 ob[2]="hello";
		 ob[3]=56.55;
		 ob[4]=true;
		 System.out.println(" to print all the values of array");
		 for(int l=0;l<ob.length;l++)
		 {
			 System.out.println(ob[l]);
		 }
		 ob[5]="exceding the memory allocated";
		 System.out.println(ob[5]);

	}
}
