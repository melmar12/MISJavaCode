import javax.swing.*;
public class Faculty extends CollegeEmp
{
	private boolean tenured = false;

	public void setData() 
	{
		super.setData();
		String userInput = JOptionPane.showInputDialog(null, "tenured? true - Y or N?");

		if (userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y')
				tenured = true;
	}

	public void display()
	{
		super.display();
		System.out.println("tenured: " + tenured);
	}
}