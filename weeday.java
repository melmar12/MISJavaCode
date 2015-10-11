import javax.swing.*;
public class weeday {
	public static void main(String[] args)
	{

		boolean validWeekday = false;
		String userInput = "";

		do 
		{
			userInput = JOptionPane.showinputDialog(null, "enter a weekday - it must begin with a capitol letter");

				if (userInput.equals("Monday")|| userInput.equals("Tuesday")||userInput.equals("Wednesday")||userInput.equals("Thursday")||userInput.equals("Friday")||userInput.equals("Saturday")||userInput.equals("Sunday"))
				{
					validWeekday = true;
				}

		} while (!validWeekday);
		JOptionPane.showDialogbox(null, "Good job! You entered " + userInput);
	 
	}
}