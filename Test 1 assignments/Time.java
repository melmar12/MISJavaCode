// Tue, Sep 1 | ch 2
// Thu Sep 3 | ch 2 cont'd. | added dialog boxes and user input
import javax.swing.JOptionPane;
public class  Time 
{
	public static void main(String[] args) 
	{
		String minutes;
		minutes = JOptionPane.showInputDialog(null, "how many minutes did you work?");

		int hours = Integer.parseInt(minutes) / 60;
		int minutesLeftOver = Integer.parseInt(minutes) % 60;

		JOptionPane.showMessageDialog(null, minutes + " minutes is equal to " + hours + " hours and " + minutesLeftOver + " minutes."); 	
	}
}