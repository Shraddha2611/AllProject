package collectionExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Shraddha");
		hm.put(2, "Prajapati");
		hm.put(3, "Computer");
		hm.put(4, "Engineer");
		System.out.println(hm.get(1));
		System.out.println(hm.remove(3));
		System.out.println(hm);
		Set<Entry<Integer, String>> e = hm.entrySet();
		Iterator<Entry<Integer, String>> i = e.iterator();
		while (i.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry me = (Map.Entry) i.next(); // to print key and value seprately map.entry is used
			System.out.println(me.getKey());
			System.out.println(me.getValue());

		}
	}

}
