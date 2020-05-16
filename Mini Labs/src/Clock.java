public class Clock{
	public static void main(String [] args){
		Clock clock = new Clock();
	}
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Clock(){
		12, 0, 0;
	}
	
	public Clock(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public secondsSinceMidnight(setClock() ){
		setClock();
	}
	
	public void setClock(){
		hours * 3600 + minutes * 60 + seconds;
	}
	
	public int getHours(){
		return hours;
	}
	
	public int getMinutes(){
		return minutes;
	}
	
	public int getSeconds(){
		return seconds;
	}
	
	public void setHours(int hours){
		
		this.hours = hours;
	}
	
	public void setMinutes(int minutes){
		
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds){
		
		this.seconds = seconds;
	}
	
	public void tick(){
		
		this.seconds += 1;
		
		if(this.seconds > 59){
			
			this.seconds = 0;
			
			this.minutes += 1;			
		}
		
		if(this.minutes > 59){
				
			this.minutes = 0;
				
			this.hours += 1;
		}
		
		if(this.hours > 23){
					
			this.hours = 0;
		}
	}

	public void addClock(Clock anotherClock){
		
		this.seconds += anotherClock.getSeconds();		
				
		this.minutes += anotherClock.getMinutes();
		
		this.minutes += (int)(this.seconds / 60);
		
		this.seconds = this.seconds % 60;
		
		this.hours += anotherClock.getHours();
		
		this.hours += (int)(this.minutes / 60);
		
		this.minutes = this.minutes % 60;
		
		this.hours = this.hours % 24;
	}
	
	public tickDown(){
		
		this.seconds -= 1;
		
		if(this.seconds < 0){
			
			this.seconds += 60;
			this.minutes -= 1;
		}
		
		if(this.minutes < 0){
			
			this.minutes += 60;
			this.hours -= 1;
		}
		
		if(this.hours < 0){
			this.hours += 24;
		}
	}
	
	public void substractClock(Clock anotherClock){
		
		this.seconds -= anotherClock.getSeconds();
		
		this.minutes -= anotherClock.getMinutes();
		
		this.minutes += (int)(this.seconds / 60);
		
		this.seconds = this.seconds % 60;
		
		this.hours -= anotherClock.getHours();
		
		this.hours += (int)(this.minutes / 60);
		
		this.minutes = this.minutes % 60;
		
		this.hours = this.hours % 24;
	}
	
	public String toString(){
		 String str = "";

        if(hours < 10){
			str = "0";
			str = str + hours + ":";
		}
		
        if(minutes < 10){
	        str = str + "0" ;
			str = str + minutes + ":";
		}
		
        if(seconds < 10){	        
			str = str + "0";
			str = str + seconds;
		}
		
        return str;
	}
}
	
	











