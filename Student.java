import javax.swing.*;
public class Student extends Person 
{
	private String major;

	public void setData()
	{
		super.setData();
		major = JOptionPane.showInputDialog(null, "what is your major?");
	}

	public void display()
	{
		super.display();
		System.out.println("major: " + major);
	}
}