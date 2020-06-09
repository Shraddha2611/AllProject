
public class reversePalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "Shraddha";
		String s="";
		System.out.println(a);
		for(int i=a.length()-1;i>=0;i--) {
			s = s + a.charAt(i);
		}
		System.out.println(s);

		if(s==a) {
			System.out.println("string is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}
			
	}

}
