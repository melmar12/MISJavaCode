// sep 8 cont'd (sep 10)
public class Eggs
{
	public static void main(String[] args)
	{
		int numberOfEggs = 200;
		calcEggs(numberOfEggs);

	}
	public static void calcEggs(int numEggs)
	{
		int eggsInDozens = numEggs / 12;
		int eggsLeftOver = numEggs % 12;

		System.out.println( numEggs + " eggs results in " + eggsInDozens + " dozen eggs with " + eggsLeftOver + " left over.");
	}
}