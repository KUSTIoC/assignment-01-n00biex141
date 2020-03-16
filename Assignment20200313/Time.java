public class Time{
	private int Hours, Minutes;
	
	public Time(int hours, int minutes){
		//For checking the hours
		if(hours <= 0 || hours > 23)
			throw new IllegalArgumentException("Hours (" + hours + ") must be 1-24");
		
		//For checking the minutes
		if(minutes < 0 || minutes > 60)
			throw new IllegalArgumentException("Minutes (" + minutes + ") must be 0-59");
		
		Hours = hours;
		Minutes = minutes;
	}
	
	public String toString(){
		return String.format("%nPaper Time: %d:%d", Hours, Minutes);
	}
}