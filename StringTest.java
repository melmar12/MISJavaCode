import javax.swing.*;
public class StringTest 
{
	public static void main(String[] args)
	{
		String theString = JOptionPane.showInputDialog(null, "enter some text");
		int letters= 0;

		for (int i=0; i < theString.length(); i++)
		{
			char ch = theString.charAt(i);

			if (Character.isLetter(ch))
				letters++;
		}
		System.out.println(letters);
	}
}
