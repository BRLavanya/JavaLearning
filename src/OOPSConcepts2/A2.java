package OOPSConcepts2;

public  class A2 extends A1 {
	A2()
	{
		super(10);
		System.out.println("heelo");
	}
	public void sms()
	{
		System.out.println("A2");
		A1 a = new A1(10);
		a.sms();
		sms();
	}
}
