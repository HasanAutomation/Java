import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("Java");
		ll.add("NodeJs");
		ll.add("Javascript");
		ll.add("C");

		// print
		System.out.println("Contents of linkedlist " + ll);
		for (Object ele : ll)
			System.out.println(ele);

		// addFirst
		ll.addFirst("Hasan");

		// addLast
		ll.addLast("Automation");
		System.out.println(ll);

		ll.add(2, "QA");
		System.out.println(ll);
		// Set
		ll.set(0, "Unknown");
		System.out.println(ll);

		ll.add("Flutter");
		System.out.println(ll);
		ll.add(0, "LinkedList");
		System.out.println(ll);

		// RemoveFirst and RemoveLast

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		// Remove from index
		ll.remove(2);
		System.out.println(ll);
		System.out.println();
		System.out.println();

		// Iterate
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			String l1 = it.next();
			System.out.println(l1);
			System.out.println("********************");
			// while loop
			int num = 0;
			while (num < ll.size()) {
				System.out.println(ll.get(num));
				num++;
			}
		}
	}

}
