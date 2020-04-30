package OOPSConcepts3;

public class throwException
{
	public static void age(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("underAgeException minor");
		}
		else {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		age(12);
	}
}
