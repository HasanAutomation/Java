import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements Map
		// extends AbstractMap
		// stores value on the basis of key-value pair
		// stores unique elements
		// it may have only one null key and multiple values
		// it maintains no order
		// it is non-synchronized-multiple threads can access it
		// failed fast condition
		// it gives concurrent modification exception means-one thread is modifying the
		// value and the other thread trying
		// to access the value then it gives concurrent modification exception
		//after removing value from hashMap the key won't be shifted
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		System.out.println(hm.get(1));
		System.out.println(hm.isEmpty());

		// print
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// remove
		hm.remove(2);
		for (Entry<Integer, String> m : hm.entrySet())

		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("NA", 12, "Dev");
		Employee e2 = new Employee("AN", 21, "Ved");
		hm1.put(1, e1);
		hm1.put(2, e2);
		for (Entry<Integer, Employee> m : hm1.entrySet()) {
			int key = m.getKey();
			Employee emp = m.getValue();
			System.out.println(key + " Info");
			System.out.println(emp.name + " " + emp.age + " " + emp.dept);

		}

	}

}
