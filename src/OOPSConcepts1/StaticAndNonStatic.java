package OOPSConcepts1;

public class StaticAndNonStatic 
{
	int age =25;
	static String name ="tom";
	
	public void details()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	public static void methods()
	{
		System.out.println("static method");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("ways to print to static methods");
		System.out.println("name is "+ name);
		System.out.println(StaticAndNonStatic.name);
		
		StaticAndNonStatic.methods();
		methods();

		System.out.println("ways to print to non static methods");
		StaticAndNonStatic s = new StaticAndNonStatic();
		System.out.println(s.age);
		s.details();
	}

}
