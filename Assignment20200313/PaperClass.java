public class PaperClass{	
	//Instance Variables
	private String PaperTitle;
	private int PaperID;
	private String CourseCode;
	private String CourseInCharge;
	private String Semester;
	private String ProgramName;
	
	private String Invigilator, Location;
	private int NumOfStudents;
	private boolean isCollected;
	private String isCollectedDisplay;
	
	private Date date;
	private Time time;
	
	//Default Constructor
	public PaperClass(){
		
	}
	
	public PaperClass(String papertitle, int paperid, String coursecode, String courseincharge, String semester, String programname, String invigilator, String location, int numofstudents, boolean iscollected, Date datee, Time timee){
		PaperTitle = papertitle;
		PaperID = paperid;
		CourseCode = coursecode;
		CourseInCharge = courseincharge;
		Semester = semester;
		ProgramName = programname;
		Invigilator = invigilator;
		Location = location;
		NumOfStudents = numofstudents;
		isCollected = iscollected;
		date = datee;
		time = timee;
	} 
	
	public PaperClass(int paperid, String coursecode, int numofstudents, boolean iscollected){
		PaperID = paperid;
		CourseCode = coursecode;
		NumOfStudents = numofstudents;
		isCollected = iscollected;
	} 
	
	//Setter 
	public void setisCollected(boolean iscollected){
		isCollected = iscollected;
	}	
	
	//Getters
	public String getPaperTitle(){
		return PaperTitle;
	}
	public int getPaperID(){
		return PaperID;
	}
	public String getCourseCode(){
		return CourseCode;
	}
	public String getCourseInCharge(){
		return CourseInCharge;
	}
	public String getSemester(){
		return Semester;
	}
	public String getProgramName(){
		return ProgramName;
	}
	
	public Date getDate(){
		return date;
	}
	public Time getTime(){
		return time;
	}
	
	public String getInvigilator(){
		return Invigilator;
	}
	public String getLocation(){
		return Location;
	}
	public int getNumOfStudents(){
		return NumOfStudents;
	}
	public boolean getisCollected(){
		return isCollected;
	}	
	
	public String toString(){
		if(isCollected == true)
			isCollectedDisplay = "Yes";
		else
			isCollectedDisplay = "No";
	return String.format("Paper Title: %s %nPaper ID: %d %nCourse Code: %s %nCourse InCharge: %s %nSemester: %s %nProgram Name: %s %nInvigilator: %s %nLocation: %s %s%s %nNumber of Students: %d %nPaper collected: %s", PaperTitle, PaperID, CourseCode, CourseInCharge, Semester, ProgramName, Invigilator, Location, date, time, NumOfStudents, isCollectedDisplay);
	}
}