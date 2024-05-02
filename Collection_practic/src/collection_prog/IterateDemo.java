package collection_prog;
//java program to iterate HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateDemo {
	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Angular");
		hm.put("J", "java");
		hm.put("P", "Python");
		hm.put("H", "Hibernate");

		for (Entry<String, String> set : hm.entrySet()) {
			System.out.println(set.getKey() + " = " + set.getValue());
		}

	}

}
