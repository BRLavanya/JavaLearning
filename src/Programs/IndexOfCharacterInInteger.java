package Programs;

import java.util.Scanner;

public class IndexOfCharacterInInteger {

	static int frequencyDigits(int num, int ch) 
	{  
		int index = -1;
		while(num>0)
		{
			if(num%10==ch)
				index++;
				num=num/10;
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println("enter the number for which index is to be found");
		int ch = sc.nextInt();
		int length = Integer.toString(num).length();
		System.out.println("length of the number is"+length);
		if(frequencyDigits(num, ch)==-1){
		System.out.println("number is not found");
		}
		else
		{
			System.out.println("number is found "+frequencyDigits(num, ch));
		}
	}
}	
//		for (int i = 0; i < length; i++) {
//			int a = Integer.toString(s).charAt(i);
//			if (ch == a) {
//				index = (Integer.toString(s).charAt(i));
//				System.out.println(index-1);
//			}
//		}
//		if(index>-1)
//		{
//			System.out.println("character: "+ch+" is found at "+index);
//		}
//		else
//		{
//			System.out.println("character is not found in the string: "+s);
//		}
	

