public class DemoSquare {
	// does things
	public static void main(String[] args)
	{


		Square aSquare = new Square();
		Cube aCube = new Cube();




		aSquare.setHeight(10);
		aSquare.setWidth(5);
		aSquare.computeSurfaceArea();


		aCube.setHeight(10);
		aCube.setWidth(5);
		aCube.setDepth(4);
		aCube.computeSurfaceArea();

		System.out.println("Area is " + aSquare.getSurfaceArea());
		System.out.println("Cube area is " + aCube.getSurfaceArea());
	}
}