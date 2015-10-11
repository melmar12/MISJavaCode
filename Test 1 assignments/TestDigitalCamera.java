import javax.swing.*;
public class TestDigitalCamera {

	public static void main(String[] args)
	{
		DigitalCamera camera1 = new DigitalCamera(JOptionPane.showInputDialog(null, "What brand?"), Integer.parseInt(JOptionPane.showInputDialog(null, "How many megapixels?")));
		DigitalCamera camera2 = new DigitalCamera(JOptionPane.showInputDialog(null, "What brand?"), Integer.parseInt(JOptionPane.showInputDialog(null, "How many megapixels?")));

		camera1.displayInfo();
		camera2.displayInfo();
	}
}