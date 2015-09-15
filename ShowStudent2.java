public class ShowStudent2 {
/*
Creat a constructor for the Student class you created. The constructor should initialize each Student's ID number to 9999, his or her points earned to 12, and credits to 3 (results in gpa 4.0). Write a program the demos that the constructor works by instantiating an obj and displaying the initial vals. Save app as ShowStudent2.java
*/


	// constructor goes into Student.java 

	public static void main(String[] args)
	{
		Student timmy = new Student();
		timmy.calcGPA();
		System.out.println("Student ID: " + timmy.getStudentID());
		System.out.println("Credit Hours: " + timmy.getCreditHours());
		System.out.println("Grade Points: " + timmy.getGradePoints());
		System.out.println("GPA: " + timmy.getGPA());
	}

}