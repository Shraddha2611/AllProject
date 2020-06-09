import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("d/M/YYYY");
		System.out.println(sd.format(d));
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/YYYY hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
	}

}
