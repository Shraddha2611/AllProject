
public class functionOverloading {

	
	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(int a,int b) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionOverloading fo = new functionOverloading();
		fo.getData(10);
		fo.getData("Shraddha");
		fo.getData(5,20);
		
	}

}
