import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long l = System.currentTimeMillis(); //milliseconds since Jan 1 1970
		System.out.println(l); // 
		System.out.println(l / (1000*60*60*24)); // 1000 = 1 seconds, 60 = 1 min, 60 = 1 hour, 24 = 1 day
		//number of days since 1970 jan 1 
		
		//Another way to deal with dates is through the Date class
		Date d = new Date();
		System.out.println(d); // Day Month Day Time(XX:XX:XX) TimeZone Year
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfWithHour = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss");
		String f = sdf.format(d);
		System.out.println(f);
		f = sdfWithHour.format(d);
		System.out.println(f);
		
		Calendar c = new GregorianCalendar(1980, 10, 20);
		System.out.println("day of the month " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("day of the week " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("day of the year " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("month of the year " + c.get(Calendar.MONTH));
		
		Date dd = c.getTime();
		SimpleDateFormat smpDateFormat = new SimpleDateFormat("EEEE yyyy-MMMM-dd");
		System.out.println(smpDateFormat.format(dd));
	}

}
