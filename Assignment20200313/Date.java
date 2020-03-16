public class Date{
	private int Date, Month, Year;
	
	private static final int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int date, int month, int year){
		//For checking the date
		if(date <= 0 || date > 31 || Date > months[month] && !(month == 2 && date == 29))
			throw new IllegalArgumentException("Date (" + date + ") must be 1-31");
		
		// check if month in range
		if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
		
		//Checking if we got any case of leap year
		if(month == 2 && date == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("Date (" + date + ") out of range for the specific month and year");
		
		Date = date;
		Month = month;
		Year = year;
	}
	
	public String toString(){
		return String.format("%nPaper Date: %d/%d/%d", Date, Month, Year);
	}
}