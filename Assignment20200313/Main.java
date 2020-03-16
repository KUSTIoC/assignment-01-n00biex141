public class Main{		
	public static void main(String[] args){
		Date date1 = new Date(16,03,2020);
		Time time1 = new Time(3, 30);
		PaperClass PC1 = new PaperClass("Programming", 10110, "CS213", "Prof.Ali Zeb", "2nd Semester", "BCS", "M.Khan", "ClassRoom.6", 30, false, date1, time1);

		Date date2 = new Date(17,03,2020);
		Time time2 = new Time(1, 30);
		PaperClass PC2 = new PaperClass("Mathematics", 12314, "MS103", "Prof.Israr", "4th Semester", "BCS", "M.Ali Khan", "ClassRoom.4", 40, false, date2, time2);
	
		Date date3 = new Date(18,03,2020);
		Time time3 = new Time(9, 00);
		PaperClass PC3 = new PaperClass("Communication Skills", 55612, "CH111", "Prof.Asif", "2nd Semester", "BCS", "Ibrar Khan", "ClassRoom.1", 50, false, date3, time3);
		
		
		System.out.println("*********************************************************************");
		System.out.print(PC1);
		System.out.print("\n*********************************************************************\n");
		System.out.print(PC2);
		System.out.print("\n*********************************************************************\n");
		System.out.print(PC3);
		System.out.print("\n*********************************************************************");
		
		System.out.println("\nTHESE ARE COURSES ASSOCIATED WITH THEIR PAPERS\n");
		
		CourseClass CC1 = new CourseClass("OOP", "CS213", "BCS", "2nd Semester", PC1);
		CourseClass CC2 = new CourseClass("MATHEMATICS", "MS103", "BCS", "4th Semester", PC2);
		
		System.out.print(CC1);
		System.out.print("\n*********************************************************************\n");
		System.out.print(CC2);
		System.out.print("\n*********************************************************************");
	}

}