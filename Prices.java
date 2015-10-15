public class Prices
{



	public static void main(String[] args)
	{



		double[] priceList = {2.34, 7.89, 1.34, 6.89, 1.30, 4.65};

		double priceSum = 0;

		double lessFive[] = new double;

		double average = ;

		
		/// sum
		for (int i=0; i < priceList.length; i++)
		{
			//priceSum = priceSum + priceList[i];
			priceSum += priceList[i];

		}

		System.out.println(priceSum);

		/*// less than five
		for (int i=0; i < priceList.length; i++)
		{
			int place = 0;

			if (priceList[i]<5)
			{
				lessFive[place] = priceList[i];
				place++;

			}
		}
		System.out.println(lessFive); */

		//P less 5 
		for (int i=0; i < priceList.length; i++)
		{
		if (priceList[i] < 5.00)
			System.out.println(priceList[i] + " is less than 5.00");
		}
		//P avg
		average = sum / priceList.length;
		System.out.println("The average price is " + average); 

		//P greater than average
		for (int i=0; i < priceList.length; i++)
		{
			if (priceList[i] > average)
				System.out.println(priceList[i] + " is greater than average");
		}


	}




}