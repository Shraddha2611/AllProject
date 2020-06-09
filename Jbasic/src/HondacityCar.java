
public class HondacityCar extends CarProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondacityCar hc = new HondacityCar();
		hc.carName();
		hc.carColor();
		hc.carEngine();
		hc.carModel();
	}

	@Override
	public void carName() {
		// TODO Auto-generated method stub
		System.out.println(" name is hondacity");
	}

	@Override
	public void carColor() {
		// TODO Auto-generated method stub
		System.out.println(" color is black ");
	}
}
