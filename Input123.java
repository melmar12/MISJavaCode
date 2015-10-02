import javax.swing.*;
public class Input123 {

	public static void main(String[] args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "enter number"));


		while ( n  != 4) {
			if (n ==1 || n == 2 || n == 3 )
				System.out.println("Good Job");
			else
				System.out.println("Error");
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "enter number"));

		}

	

		


	}
}