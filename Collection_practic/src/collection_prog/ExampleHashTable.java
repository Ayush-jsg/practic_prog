package collection_prog;
//java code to illustrate the keySet() method 

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashTable {
	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "geeks");
		ht.put("2", "for");
		ht.put("3", "geeks");
		System.out.println(ht);

		Set s = ht.keySet();
		System.out.println("set create from Hashtable keys contant");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
