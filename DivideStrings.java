import javax.swing.*;
public class DivideStrings 
{
	public static void main(String[] args)
	{


		String [] longStrings = new String[5];
		String [] shortStrings = new String[5];
		int longCount = 0, shortCount = 0;

		for (int totalCount = 0; totalCoun < longStrings.length; totalCount++)
		{
			String userInput = JOptionPane.showInputDialog(null, "Enter a string");
			if (userInput.length() > 5)
			{
				longStrings[longCount] = userInput;
				longCount++;
			}
			else 
			{
				shortStrings[shortCount] = userInput;
				shortCount++;
			}

			String stringType = JOptionPane.showInputDialog(null, "Enter short or long for the string list you'd like to see:");
			if (stringType.equals("short"))
			{
				if (shortCount == 0)
				{
					System.out.println("none found");
				}
				else 
				{
					for (int x = 0; x < shortCount; x++)
					{
						System.out.println(shortStrings[x]);
					}

				else if (stringType.equals("long"))
				{

					if (longCount == 0)
					System.out.println("none found");
				else 
				{
					for (int x = 0; x < longCount; x++)
					{
						System.out.println(longStrings[x]);
					}
				}
			}





				}
			}
		}

	}

}