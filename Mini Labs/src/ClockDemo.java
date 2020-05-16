public class ClockDemo{

	public static void main(String[] args) {
		
		Clock firstClock = new Clock();
		firstClock = 1;
		
		firstClock.secondsSinceMidnight();
		
		firstClock = 0;
			
			firstClock.tick();
			System.out.print(firstClock);
		
		
		
	}
	
}