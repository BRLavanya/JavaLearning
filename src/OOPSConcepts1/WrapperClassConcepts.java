package OOPSConcepts1;

public class WrapperClassConcepts
{
	public static void main(String[] args)
	{
		String s ="90";
		int x =10;
		x+=Integer.parseInt(s);
		System.out.println(x);
		
		String p = "1010.56";
		double d = 5.00;
		d+=Double.parseDouble(p);
		System.out.println(d);
		
		String c="true";
		System.out.println(Boolean.parseBoolean(c));
		
		int l=143;
		String c1="hello";
		c1+=String.valueOf(l);
		System.out.println(c1);
		
		String l3= "100A";
		int y =10;
		y+=Integer.parseInt(l3);
		System.out.println(y); //NumberFormatException
		
		
	}
}
