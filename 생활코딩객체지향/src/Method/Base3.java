package Method;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Base3 {
	
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}

	public static void main(String[] args) {

		System.out.println(Base3.getCurrentDate("yyyyMMdd"));

	}

}
