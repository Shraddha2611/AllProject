
public class SuperChild extends SuperParent {
	String name = " Prajapati";

	public SuperChild() {
		super();
		System.out.println(" i am child constructor ");
	}
	public void display() {
		System.out.println(name);
		System.out.println(super.name);

	}

	public void getData() {
		System.out.println(" i am in child class ");
		super.getData();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChild sc = new SuperChild();
		sc.getData();
		sc.display();
	}

}
