package OOPSConcepts3;

class InvalidAge extends Exception
{
	public InvalidAge(String s) 
	{
		super(s);
	}
}
public class CustomException{
	public static void age(int age) throws InvalidAge
	{
		if(age<18)
		{
			throw new InvalidAge("minor");
		}
		else
		{
			System.out.println("major");
		}
	}
	public static void main(String[] args) {
		try {
			age(16);
		} catch (InvalidAge e) {
			e.printStackTrace();
			System.out.println("******");
			System.out.println(e.getMessage());
		}
	}
}
