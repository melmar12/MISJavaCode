import javax.swing.*;
public class Person 
{

	private String firstName; 
	private String lastName; 
	private String phoneNumber;

	public void setData() 
	{
		firstName = JOptionPane.showInputDialog(null, "Enter First Name");
		lastName = JOptionPane.showInputDialog(null, "Enter Last Name");
		phoneNumber = JOptionPane.showInputDialog(null, "Enter Phone Number");
	}


	public void display() 
	{
		System.out.println(firstName + " " + lastName + " (" + phoneNumber + ") ");
	}


}