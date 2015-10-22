public class Square
{

	private int height;
	private int width;
	private int surfaceArea;



	public void setHeight(int h)
	{
		height = h;
	}
	public int getHeight()
	{
		return height;
	}

	public void setWidth(int w)
	{
		width = w;
	}
	public int getWidth()
	{
		return width;
	}
	public void computeSurfaceArea()
	{
		surfaceArea = height*width;
	}
	public void setSurfaceArea(int a)
	{
		surfaceArea = a;
	}
	public int getSurfaceArea() 
	{
		return  surfaceArea;
	}
}