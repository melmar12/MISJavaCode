import javax.swing.*;
public class MISArray 
{
	public static void main(String[] args) 
	{

		String[] reasons = {"JAVA is life", "I failed code school", "batman", "what is life"};
		int numb = Integer.parseInt(JOptionPane.showInputDialog(null, "enter a number between 1 and 5"));
		System.out.println("I joined MIS because "  + reasons[numb-1]);

	}
}