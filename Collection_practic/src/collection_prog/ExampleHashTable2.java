package collection_prog;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashTable2 {
	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();

		ht.put("geeks", "1");
		ht.put("for", "2");
		ht.put("geeks", "3");

		System.out.println(ht);

		Set s = ht.keySet();
		System.out.println("set create from Hashtable keys contant");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
