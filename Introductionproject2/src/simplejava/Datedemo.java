package simplejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date da = new Date();
		System.out.println(da.toString());
		SimpleDateFormat sm = new SimpleDateFormat("MM/d/YYYY");
		System.out.println(sm.format(da));
		
		
		
		

	}

}
