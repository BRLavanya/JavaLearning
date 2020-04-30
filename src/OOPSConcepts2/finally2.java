package OOPSConcepts2;

public class finally2
{
public static void main(String[] args) {
	test1();
}
public static void test1()
{
	int a =10;
	try {
		
	}
	finally {
		System.out.println("hello");
		test2();
		test1();
	}
	
}
public static void test2()
{
	System.out.println("test2");
}
}
