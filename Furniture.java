import javax.swing.*;

public class Furniture {

	public static void main(String[] args)
	{

		String woodType = "";
		int price = 0;
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose 1 for pine, 2 for oak, or 3 for mahogany."));

	/*	// my original code
		int mahogany = 3;
		int oak = 2;
		int pine = 1;
		int mahoganyPrice = 310;
		int oakPrice = 225;
		int pinePrice = 100;
	*/

		if(choice = 1)
		{
			WoodType = "pine";
			price = 310;
		}
		if(choice = 2)
		{
			WoodType = "oak";
			price = 225;
		}
		if(choice = 3)
		{
			WoodType = "mahogany";
			price = 310;
		}
		System.out.println("the woood type is " + woodType + "and the price is $" + price);
		
	}

	
}