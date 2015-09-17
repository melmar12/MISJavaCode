public class Box 
{
	private int length;
	private int width;
	private int height;

	// or declare vars this way; 
	// private int length, width, height; 



	// overloaded constructors 
	public Box(int l)  
	{
		length = l;
		width = 0;
		height = 0;
		System.out.println("Line created.");
	}

	public Box (int l, int x)
	{
		length = l;
		width = x;
		height = 0;
		System.out.println("Rectangle created.");
	}

	public Box (int l, int x, int y)
	{
		length = l;
		width = x;
		height = y;
		System.out.println("Box created.");
	}

}
