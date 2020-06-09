package collectionExam;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 4, 5, 3, 4, 6, 5, 2, 3, 4 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) 
		{		
			int k = 0;

			if (!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) 
				{
					if (a[i] == a[j])
					{
						k++;
					}
				}
				System.out.println("number is  = " + a[i]+"\t"+"repeted time = " + k);
				System.out.println("");
				if(k==1)
				{
					System.out.println(a[i]+  " is unique number ");
					System.out.println("");
				}
			}

		}
	}

}
