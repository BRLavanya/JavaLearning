package OOPSConcepts1;

public class ClassObjects {
	int model;
	int wheel;

	public static void main(String[] args) {
		ClassObjects c1 = new ClassObjects();
		ClassObjects c2 = new ClassObjects();
		ClassObjects c3 = new ClassObjects();

		c1.model = 2014;
		c1.wheel = 2;

		c2.model = 2015;
		c2.wheel = 3;

		c3.model = 2016;
		c3.wheel = 4;

		System.out.println("before shifting");
		System.out.println("MODEL NUMBER IS " + c1.model);
		System.out.println("NUMBER OF WHEELS IS " + c1.wheel);

		System.out.println("MODEL NUMBER IS " + c2.model);
		System.out.println("NUMBER OF WHEELS IS " + c2.wheel);

		System.out.println("MODEL NUMBER IS " + c3.model);
		System.out.println("NUMBER OF WHEELS IS " + c3.wheel);

		System.out.println("after shifting");
		c1 = c2;
		c2 = c3;
		c3 = c1;

		System.out.println("MODEL NUMBER IS " + c1.model);
		System.out.println("NUMBER OF WHEELS IS " + c1.wheel);

		System.out.println("MODEL NUMBER IS " + c2.model);
		System.out.println("NUMBER OF WHEELS IS " + c2.wheel);

		System.out.println("MODEL NUMBER IS " + c3.model);
		System.out.println("NUMBER OF WHEELS IS " + c3.wheel);

		System.out.println("*******************");
		c1.model = 2020;
		System.out.println("MODEL NUMBER IS " + c1.model);
		c3.model = 2021;
		System.out.println("MODEL NUMBER IS " + c1.model);
		System.out.println("MODEL NUMBER IS " + c3.model);

	}

}
