import javax.swing.JOptionPane;
public class IQ 
{
	
	public static void main(String[] args)
	{
		int iqScore = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your IQ score."));

		if(iqScore < 0 || iqScore > 200)
		{
			JOptionPane.showMessageDialog(null, "ERROR: Value out of range.");

		}
		else 
		{
			if (iqScore < 100)
			{
				JOptionPane.showMessageDialog(null, "Below Average.");
			}
			if (iqScore == 100)
			{
				JOptionPane.showMessageDialog(null, "Average.");
			}
			if (iqScore > 100)
			{
				JOptionPane.showMessageDialog(null, "Above Average.");
			}

			/*create value for message, online write DialogBox once... */	
		}
	}
}