package Programs;

import java.util.Scanner;

public class IndexOfCharacterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println("enter the character for which index is to be found");
		String ch=sc.nextLine();
		int index=s.indexOf(ch);
		if(index>-1)
		{
			System.out.println("character: "+ch+" is found at "+index);
		}
		else
		{
			System.out.println("character is not found in the string: "+s);
		}

	}

}
