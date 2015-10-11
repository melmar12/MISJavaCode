public class Population {

	public static void main(String[] args)
	{
		int mexico = 114000000;
		int us = 312000000;
		int years =0;

		while (mexico < us)
		{
			mexico *= 1.0101;
			us *= 0.9985;
			years++;
		} 
		System.out.println("Mexico: " + mexico);
		System.out.println("US: " + us);jav
		System.out.println("Number of years: " + years);
	}
}