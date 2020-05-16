public class Item{
	private double price;
	private String name;
	
	public Item(){
	}
	
	public Item(double price, String name){
		
		this.price = price;
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void printInfo(){
		System.out.println("______________________________________________________________________");
		System.out.println("ITEM CLASS SECTION: \nMOVIE's name: " + name + "\nPrice: $" + price);
	}
}