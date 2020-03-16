public class CourseClass{
	
	private String CourseName;
	private String CourseCode;
	private String ProgramName;
	private String Semester;
	
	private PaperClass Paper;
	
	public CourseClass(String coursename, String coursecode, String programname, String semester, PaperClass paper){
		CourseName = coursename;
		CourseCode = coursecode;
		ProgramName = programname;
		Semester = semester;
		Paper = paper;
	}	
	public void setCourseCode(String coursecode){
		CourseCode = coursecode;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	public String getCourseCode(){
		return CourseCode;
	}
	public String getProgramName(){
		return ProgramName;
	}
	public String getSemester(){
		return Semester;
	}
	
	public String toString(){
		return String.format("%nCourse Name: %s %nCourse Code: %s %nProgram Name: %s %nSemester: %s %n***THE EXAM DETAILS***%n%s", CourseName, CourseCode, ProgramName, Semester, Paper);
	}
}