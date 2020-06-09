
public class IndiaTraffic implements centralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centralTraffic a = new IndiaTraffic();
		a.redStop();
		a.greenGo();
		a.yelloFlash();
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" red Stop ");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" green go ");
		
	}

	@Override
	public void yelloFlash() {
		// TODO Auto-generated method stub
		System.out.println(" yello  flash ");

	}

}
