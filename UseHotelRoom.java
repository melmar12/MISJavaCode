public class UseHotelRoom
{
	public static void main(String[] args)
	{
		HotelRoom lowRoom = new HotelRoom(215);
		HotelRoom highRoom = newHotelRoom(415);
		Suite lowSuite = new Suite(260);
		Suite highSuite = new Suite(500);

		
		System.out.println("Low room " + lowRoom.getRoomNum() + " rate " + lowRoom.getRoomNum());
		System.out.println("Low room " + highRoom.getRoomNum() + " rate " + highRoom.getRoomNum());
		System.out.println("Low room " + lowSuite.getRoomNum() + " rate " + lowSuite.getRoomNum());
		System.out.println("Low room " + highSuite.getRoomNum() + " rate " + highSuite.getRoomNum());
	}
}