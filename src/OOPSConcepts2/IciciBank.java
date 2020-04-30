package OOPSConcepts2;

public  class IciciBank implements RBI {

	@Override
	public void credit() {
		System.out.println("credit card facility fro, worldbank ");
	}

	@Override
	public void debit() {
		System.out.println("debit card facility fro, worldbank");

	}

	@Override
	public void helloMsg() {
		System.out.println("hello from AA");
	}

	
	public void homeLoan() {
		System.out.println("home loan");

	}

	//@Override
	public void iciciHome() {
		System.out.println("icici hello");
	}

	@Override
	public void eduLoan() {
		// TODO Auto-generated method stub
		
	}
}
