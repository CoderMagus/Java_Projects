
public class showCurrentTime {
	public static void main(String[] args) {
		
		//obtain total milliseconds
		long totalMilliseconds = System.currentTimeMillis();
		//obtain total seconds
		long totalSeconds = totalMilliseconds / 1000;
		//Compute current second in the minute of the hour
		long currentSecond = (int)(totalSeconds % 60);
		//obtain total minutes
		long totalMinutes = totalSeconds / 60;
		//Compute current minute in the hour
		long currentMinute = totalMinutes % 60;
		//obtain total hours
		long totalHours = totalMinutes / 60;
		//Compute current hour
		long currentHour = totalHours % 24;
		//Display results
		System.out.println("Current time is: " + currentHour + ":" + 
								currentMinute + ":" + currentSecond + " GMT");
	}
}
