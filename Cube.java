public class Cube extends Square
{


	private int depth;



	public void setDepth(int d)
	{
		depth = d;
	}



	public void computeSurfaceArea()
	{
		int area = 2*getHeight()*getWidth() + 2*getWidth()*depth + 2*getHeight()*depth;
		setSurfaceArea(area);
	}
}