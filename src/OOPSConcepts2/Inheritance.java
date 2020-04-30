package OOPSConcepts2;

public class Inheritance 
{
	public static void main(String[] args)
	{
		System.out.println("static or compile time polymorphism");
		Car c = new Car();
		c.engine();
		c.fuel();
		c.start();
		
		Benz b = new Benz();
		b.engine();
		b.start();
		b.fuel();
		b.safety();
		
		System.out.println("dynamic or run time polymorphism or top casting ");
		Car c1 = new Benz();
		c1.start();
		c1.engine();
		c1.fuel();
		
		System.out.println("down casting");
		Benz b1=(Benz) new Car(); //ClassCastException
		b1.fuel();
	}
}
