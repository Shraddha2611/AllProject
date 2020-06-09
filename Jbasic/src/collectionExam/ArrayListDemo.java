package collectionExam;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shraddha");
		al.add("java");
		al.add("Prajapati");
		al.add("GECP");
		System.out.println(al);
		al.remove(1);
		al.remove(2);
		System.out.println(al);
		al.add(2, "computer");
		System.out.println(al);
		System.out.println(al.contains("java"));
		System.out.println(al.indexOf("computer"));
		System.out.println(al.size());

	}

}
