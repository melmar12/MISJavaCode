public class ShowStudent {
/*
Wtrite a class named ShowStudent that instantiates a Student obj frm the class you created and asign vals to its fields. Compute the Student grade point average, and then display all the values associated with the Student. Save the app as ShowStudent.java
*/

	public static void main(String[] args)
	{
		Student mel = new Student();

		mel.setStudentID(991);
		mel.setCreditHours(6);
		mel.setGradePoints(20);
		mel.calcGPA();

		System.out.println("Student ID: " + mel.getStudentID());
		System.out.println("Credit Hours: " + mel.getCreditHours());
		System.out.println("Grade Points: " + mel.getGradePoints());
		System.out.println("GPA: " + mel.getGPA());
	}

}