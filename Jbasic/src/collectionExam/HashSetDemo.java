package collectionExam;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>(); // does not accept duplicate value
		hs.add("java");
		hs.add("python");
		hs.add("datbase");
		hs.add("Computer Network");
		hs.add("java");
		System.out.println(hs);
		hs.remove("python");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		Iterator <String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
