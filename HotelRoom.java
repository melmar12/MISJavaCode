public class HotelRoom 
{
	private int roomNum;
	private double roomRate;






	public int getRoomNum() {
		return roomNum;
	}
	public double getRoomRate() {
		return roomRate;
	}

	public HotelRoom(int inRoom)
	{
		if (inRoom <= 299)
			roomRate = 69.96;
		else 
			roomRate = 89.95;
		roomNum = inRoom;
	}
	public void increaserate(double addToRate)
	{
		roomRate += addToRate;
	}
}
