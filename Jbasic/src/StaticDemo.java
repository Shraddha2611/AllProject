
public class StaticDemo {

	String name; //instance variable
	static String city = "Mehsana"; //class variable 
	int age;
	static String address = "ramnagar";
	static int i=0;

	static{
		//city="surat"; //static block is use for initialize static varible  
	}
	
	public StaticDemo(String name, int age) {
		this.name = name;
		this.age = age;
		i++;
		System.out.println(i);
	}

	public void getData() {
		System.out.println(name);  //instance method
		System.out.println(city);
	}

	public static void display() {
		System.out.println(address);  //class method
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo ad = new StaticDemo("Shraddha", 21);
		StaticDemo sd = new StaticDemo("Dishant", 18);

		ad.getData();
		sd.getData();  //non static method is call from object name
		StaticDemo.display();  // static method is call from class name 
	}

}
