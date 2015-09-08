// Tue, Sep 8 | ch 2/ 3?
import javax.swing.JOptionPane;
public class Monies 
{
	public static void main(String[] args)
	{
		double hourlyPay = Double.parseDouble(JOptionPane.showInputDialog(null, "what is your hourly pay rate?"));
		double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "how many hours did you work?"));
		double grossPay = hourlyPay * hoursWorked;
		double withholdingTax = grossPay * .15;
		double netPay = grossPay - withholdingTax; 
		System.out.println("gross pay: $" + grossPay);
		System.out.println("tax: $" + withholdingTax);
		System.out.println("net pay: $" + netPay);

	}
}




