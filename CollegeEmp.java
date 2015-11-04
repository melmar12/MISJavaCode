import javax.swing.*;
public class CollegeEmp extends Person 
{
	private String dept; 
	private Double salary;

	public void setData()
	{
		super.setData();
		dept = JOptionPane.showInputDialog(null, "Enter Department");
		salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Anual Salary"));
	}

	public void display()
	{
		super.display();
		System.out.println("Dept: " + dept + "\nsalary: $" + salary );
	}
}