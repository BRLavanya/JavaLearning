package OOPSConcepts2;

public  class Abstract2 extends Abstract1{

	Abstract2(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public void parent()
	{
	System.out.println("abstract 2");	
	}

	@Override
	public void gender() {
System.out.println("gender ");		
	}
	public static void main(String[] args) {
		Abstract1 a1= new Abstract2(a);
		a1.parent();
		System.out.println(a1.b);
		a1.parent();
		a1.gender();
		Abstract1.msg();
		a1.fin();
	}

}
