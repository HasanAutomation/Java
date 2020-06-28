import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		// 1.can contain duplicate values
		// 2.maintains insertion order
		// 3.synchronized
		// 4.allows random access to fetch the value as it stores the value on the basis
		// of indexes
		arrayList.add(100);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(45);
		arrayList.add("Jaan");
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		// System.out.println(arrayList.get(0));
		// to print all the values:for loop
		for (int i = 0; i < arrayList.size(); i++)
			System.out.print(arrayList.get(i) + " ");
		System.out.println();
		for (Object ele : arrayList)
			System.out.print(ele + " ");
		System.out.println();

		// generic vs non-generic
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(3);
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("test");
		ar1.add("Selenium");

		// creating objects of Employee class
		Employee e1 = new Employee("Hasan", 21, "Automation");
		Employee e2 = new Employee("Satyajit", 25, "Automation");
		Employee e3 = new Employee("Niladri", 23, "Automation");
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println();
		}
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Sel");
		ar5.add("QTP");
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("NodeJs");
		ar6.add("CSS");

		ar5.addAll(ar6);
		for (String ele : ar5)
			System.out.println(ele);
		System.out.println();

		ar5.removeAll(ar6);
		for (String ele : ar5)
			System.out.println(ele);
		System.out.println();

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Sel");
		ar7.add("QTP");
		ar7.add("Java");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("NodeJs");
		ar8.add("CSS");
		ar8.add("Java");

		ar7.retainAll(ar8);
		for (String ele : ar7)
			System.out.println(ele);

	}

}
