import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class NewDateAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * new API all objects are immutable 
		 */
		
		Instant currentInstant = Instant.now(); //gets current system date 
		System.out.println(currentInstant);
		
		Instant afterThreeSeconds =  currentInstant.plusMillis(3000); //since this is an immutable object it will return a new object
		System.out.println(afterThreeSeconds);
		
		Instant afterOneDay = currentInstant.plus(1, ChronoUnit.DAYS);
		System.out.println(afterOneDay);
		
		Instant beforeOneDay = currentInstant.minus(1, ChronoUnit.DAYS);
		System.out.println(beforeOneDay);
		
		if(currentInstant.isBefore(afterOneDay)) {
			System.out.println("Current is before");
		} else {
			System.out.println("Current is after");
		}
		
		Duration diff = Duration.between(currentInstant, afterThreeSeconds);
		System.out.println("Difference in milliseonds is " + diff.toMillis());
		
		Instant night = Instant.parse("2025-12-22T21:03:55Z");
		Instant morning =  night.plus(Duration.ofHours(8).plusMinutes(30)); //added 8 hours, and added 30 minutes 
		System.out.println(morning);
		
		long d = ChronoUnit.MINUTES.between(night, morning);
		System.out.println(d);
		
		
	}

}
