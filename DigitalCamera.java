public class DigitalCamera 
{

	private String brand;
	private int megaPixels;
	private double price;

	public DigitalCamera(String brandName, int megaPixelValue) 
	{
		brand = brandName;

		if (megaPixelValue > 10)
		{
			megaPixels = 10;
		}
		else
		{
			megaPixels = megaPixelValue;
		}
		// if value greater than 10, set to 10

		if (megaPixels <= 6)
		{
			price = 99.00;
		}
		else
		{
			price = 129.00;
		}
		// 6 or few megapixles set to $99
		// else set to $129
	}

	public void displayInfo()
	{
		System.out.println("Digital Camera " + brand + " has " + megaPixels + " megapixels and cost $" + price);
	}
	// method to dispaly DigiCam details, print the following: 
	// "Digital Camera " + brand + " has " + megaPixles + " megapixels and cost $" + price
}