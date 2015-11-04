import javax.swing.*;
public class CollegeList 
{



	public static void main(String[] args)
	{
		CollegeEmp[] emp = new CollegeEmp[3];
		Faculty[] fac = new Faculty[2];
		Student[] stu = new Student[7];
		int empCount = 0, facCount = 0, stuCount = 0;
		char letter;
		String userInput;




		do {

			userInput = JOptionPane.showInputDialog(null, "Enter 'C' for new College Employee\n 'F' for new Faculty member \n or 'S' for new Student.\n Or enter 'Q' to quit");
			letter = userInput.charAt(0);
			if (letter == 'C')
			{
				if (empCount < emp.length)
				{
					CollegeEmp employee = new CollegeEmp();
					employee.setData();
					emp[empCount] = employee;
					empCount++;
				}
			
				else {
						JOptionPane.showMessageDialog(null, "Sorry, no more space for Employees, please try another type.");
				}
			}

			else if (letter == 'F')
			{
				if (facCount < fac.length)
				{
					Faculty member = new Faculty();
					member.setData();
					fac[facCount] = member;
					facCount++;
				}
			
				else {
						JOptionPane.showMessageDialog(null, "Sorry, no more space for Faculty members, please try another type.");
				}
			}
			else if (letter == 'S')
			{
				if (stuCount < stu.length)
				{
					Student pupil = new Student();
					pupil.setData();
					stu[stuCount] = pupil;
					stuCount++;
				}
			
				else {
						JOptionPane.showMessageDialog(null, "Sorry, no more space for Students, please try another type.");
				}
			}	

		} while (letter != 'Q');

		System.out.println("\n---College Employees: ");
		if (empCount == 0)
			System.out.println("No employees entered");
		else 
			for(int x = 0; x < empCount; x++)
				emp[x].display();

		System.out.println("\n---Faculty Members: ");
		if (facCount == 0)
			System.out.println("No faculty memebers entered");
		else 
			for(int x = 0; x < facCount; x++)
				fac[x].display();

			System.out.println("\n---Students: ");
		if (stuCount == 0)
			System.out.println("No students entered");
		else 
			for(int x = 0; x < stuCount; x++)
				stu[x].display();





	}
}


