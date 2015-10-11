
// Chapter 3
public class Student 
{
	// always put vars on top like this for the quizes 
	private int studentID;
	private int creditHours;
	private int gradePoints; 
	private double gradePointAvg; // for the decimals!! 
									// memorize data types gurl

	//where do I put thisssss? A: right here. NOT ShowStudent2.java 
	public Student()
	{
		studentID = 9999; // name of the variables ^^
		creditHours = 3;
		gradePoints = 12;
	}


	public int getStudentID()
	{
		//is non-static bc multi students? sumthin like that
		return studentID;
	} 
	public void setStudentID(int numb)
	{
		//is non-static bc multi students?
		studentID = numb;
	}
	
	public int getCreditHours()
	{
		return creditHours;
	} 
	public void setCreditHours(int creds)
	{
		creditHours = creds;
	}
	public int getGradePoints()
	{
		return gradePoints;
	} 
	public void setGradePoints(int points)
	{
		gradePoints = points;
	}
	
	// calculate GPA
	public void calcGPA()
	{
		gradePointAvg = gradePoints * 1.0 / creditHours; 
	}
	public double getGPA()
	{
		return gradePointAvg;
	}


	/*
	// wrong wrong wronggg
	private int gradePointAvg = 12 / 3;
	public int getGradePointAvg()
	{
		return gradePointAvg;
	}
	*/
	
}