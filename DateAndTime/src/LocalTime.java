import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQuery;
import java.util.ArrayList;





public class LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * LocalDate
		 * LocalTime
		 * LocalDateTime
		 * 
		 * three classes we can use for local date/time
		 */
		
		LocalDate current = LocalDate.now();
		System.out.println(current); //==> YYYY-MM-DD
		
		LocalDate personalDate = LocalDate.of(2090, 9, 15);
		System.out.println(personalDate);
		
		LocalDate afterTenDays = current.plus(Period.ofDays(10));
		System.out.println(afterTenDays);
		
//		LocalDate afterNineDays = current.plus(Duration.ofDays(9)); //This won't work with Duration, must use Period
//		System.out.println(afterNineDays);
		
		System.out.println(personalDate.getDayOfWeek());
		System.out.println(personalDate.plus(Period.ofYears(1)).getDayOfWeek());
		
		Period p = Period.between(personalDate, current);
		System.out.println(p);
		System.out.println(p.getYears() + ", " + p.getMonths() + ", " + p.getDays());
		
		Period pp = personalDate.until(current);
		System.out.println(pp.getYears() + ", " + pp.getMonths() + ", " + pp.getDays());
		
		long d = personalDate.until(current, ChronoUnit.DAYS);
		System.out.println(d);
		
		
//		Check for leap year
		System.out.println(current.isLeapYear());
		
		LocalDate newPersoDate = personalDate.withDayOfYear(25); //setting day of the year
		System.out.println(newPersoDate);
		
		
		newPersoDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println(newPersoDate);
		
		
		/**
		 * Getting the first Tuesday of every month 
		 */
		LocalDate ld = LocalDate.of(2050, 2, 18);
		LocalDate adjust = null;
		int month = 1;
		while (month <= 12) {
			adjust = ld.with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY));
			System.out.println("In month = " + month + " Tuesday is on " + adjust.getDayOfMonth());
			ld=ld.plus(1,ChronoUnit.MONTHS);
			month++;
		}
		
		
		MonthDay md1 = MonthDay.now();
		System.out.println(md1);
		
		MonthDay myDay = MonthDay.of(Month.DECEMBER, 25);
		System.out.println(myDay);
		
		YearMonth curr = YearMonth.now();
		System.out.println(curr);
		
		YearMonth myValYearMonth = YearMonth.of(2065, Month.SEPTEMBER);
		System.out.println(myValYearMonth);
		
		MonthDay tocheck = MonthDay.of(Month.AUGUST, 26);
		Boolean holiday = tocheck.query(new CheckHolidayQuery());
		
		if (holiday) {
			System.out.println("The date is a holiday");
		} else {
			System.out.println("It is a working day");
		}
		
		/**
		 * Formatting Date time
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YY");
		LocalDate currDateTime = LocalDate.now();
		String output = currDateTime.format(formatter);
		System.out.println(output);
	}

}


class CheckHolidayQuery implements TemporalQuery<Boolean>
{
	java.util.List<MonthDay> holidays = new ArrayList<MonthDay>();
	public CheckHolidayQuery() {
		holidays.add(MonthDay.of(Month.JANUARY, 1));
		holidays.add(MonthDay.of(Month.FEBRUARY, 15));
		holidays.add(MonthDay.of(Month.MARCH, 22));
		holidays.add(MonthDay.of(Month.APRIL, 3));
		holidays.add(MonthDay.of(Month.MAY, 12));
		holidays.add(MonthDay.of(Month.JUNE, 16));
		holidays.add(MonthDay.of(Month.JULY, 9));
		holidays.add(MonthDay.of(Month.AUGUST, 26));
		holidays.add(MonthDay.of(Month.SEPTEMBER, 13));
		holidays.add(MonthDay.of(Month.OCTOBER, 17));
		holidays.add(MonthDay.of(Month.NOVEMBER, 24));
		holidays.add(MonthDay.of(Month.DECEMBER, 26));
	}
	
	

	@Override
	public Boolean queryFrom(TemporalAccessor temporal) {
		MonthDay md = MonthDay.from(temporal);
		// TODO Auto-generated method stub
		return holidays.contains(md);
	}
}
