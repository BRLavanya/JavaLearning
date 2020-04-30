package OOPSConcepts4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(45);
		ar.add(60);
		ar.add(02);
		System.out.println("the size of the array is: " + ar.size());
		ar.add(45);
		ar.add(33);
		ar.add('c');
		ar.add("hello");
		ar.add(45.55);
		System.out.println("the size of the array is: " + ar.size());
		System.out.println("the value of the index 2 is: " + ar.get(2));
		System.out.println("to print the array list values using for loop");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("ar[" + i + "] : " + ar.get(i));
		}
		ArrayList<String> ars = new ArrayList<String>();
		ars.add("hello");
		// ars.add(45); --> can't store because its of string

		System.out.println("************Employee class object*************");
		Employee e1 = new Employee(18, "tom", "cse");
		Employee e2 = new Employee(19, "john", "QA");
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		System.out.println("*******Iterator**********");
		Iterator<Employee> it = e.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.print(emp.name+"\t");
			System.out.print(emp.age+"\t");
			System.out.println(emp.dept+"\t");
		}
		
		ArrayList<String> arr1= new ArrayList<String>();
		arr1.add("hi");
		arr1.add("how r u?");
		arr1.add("tc");
		ArrayList<String> arr2= new ArrayList<String>();
		arr2.add("hi");
		arr2.add("i am good");
		arr2.add("tc");
		System.out.println("size of arr1 is : "+arr1.size());
		arr1.addAll(arr2);
		System.out.println("size of arr1 is : "+arr1.size());
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println("arr1[" + i + "] : " + arr1.get(i));
		}
		System.out.println("removing the arr2 elements");
		arr1.removeAll(arr2);
		System.out.println("size of arr1 is : "+arr1.size());
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println("arr1[" + i + "] : " + arr1.get(i));
		}
		ArrayList<String> arr3= new ArrayList<String>();
		arr3.add("hi");
		arr3.add("how r u?");
		arr3.add("tc");
		ArrayList<String> arr4= new ArrayList<String>();
		arr4.add("hi");
		arr4.add("i am good");
		arr4.add("tc");
		System.out.println("size of arr3 is : "+arr3.size());
		arr3.retainAll(arr4);
		for (int i = 0; i < arr3.size(); i++) {
			System.out.println("arr3[" + i + "] : " + arr3.get(i));
		}
		System.out.println("size of arr3 is : "+arr3.size());
	}
}
