import javax.swing.*;
public class PwTest
{

	public static void main(String[] args) 
	{

		String password = "";
		boolean isGood = false;

		while (!isGood)
		{

			boolean atLeastOneDigit = false, atLeastOneLetter = false, rightLength = false;

			password = JOptionPane.showInputDialog(null, "Enter a passwod\nMust be 6 to 10 characters and have at least one digit and one letter");
			int stringLength = password.length();


			if (stringLength >= 6 && stringLength <= 10)
				rightLength = true;

			for (int x = 0; x < stringLength; x++)
			{
				if (Character.isDigit(password.charAt(x)))
					atLeastOneDigit=true;
				if (Character.isLetter(password.charAt(x)))
					atLeastOneLetter = true;

			}

			if (atLeastOneDigit && atLeastOneLetter && rightLength)
			{
				isGood = true;
			}
		}
		
		String password2 = JOptionPane.showInputDialog(null, "Verify your password:");
		while(!password.equals(password2))
			password2 = JOptionPane.showInputDialog(null, "passowrds don't match, please re-enter password.");

	}
}


