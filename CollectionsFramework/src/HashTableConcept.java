import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//similiar to HashMap but synchronized
		//stores value on the basis of key and value pair
		//if two equal objects are there then it will return the same hashCode
		Hashtable hTable=new Hashtable();
		hTable.put("Name", "Hasan");
		hTable.put("Age", 23);
		System.out.println(hTable);
        Enumeration e1=		hTable.elements();
        while(e1.hasMoreElements())
        {
        	System.out.println(e1.nextElement());
        }
        
        Set set=hTable.entrySet();
        System.out.println(set);
        Hashtable h2=new Hashtable();
        h2=(Hashtable) hTable.clone();
        Enumeration e2=h2.elements();
        while(e2.hasMoreElements())
        {
        	System.out.println(e2.nextElement());
        }

	}

}
