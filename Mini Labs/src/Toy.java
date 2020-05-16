public class Toy {
    private String name;
    private double price;
    private int recAge;
    
    public Toy() {
        this(null, 0.0, 0);
    }
    
    public Toy(String name, double price, int recAge) {
        super();
        this.name = name;
        this.price = price;
        this.recAge = recAge;
    }
    
    public boolean canUse(int age) {
        return age >= this.recAge;
    }

	public static void main(String[] args){
		
		//Toy myToy = new Toy("Winnie Pooh", 25.5, 3);
		//System.out.print( myToy.canUse(2) );

		//Toy myToy = new Toy("Charmander", 19.5, 5);
		//System.out.print( myToy.canUse(5) );

		//Toy myToy = new Toy("Zelda", 11.2, 18);
		//System.out.print( myToy.canUse( -1 ) );

		//Toy myToy = new Toy("Buzz", 25.5, 10);
		//System.out.print( myToy.canUse(8) );

		//Toy myToy = new Toy("Pikachu", 21.0, 4);
		//System.out.print( myToy.canUse(5) );

		//Toy myToy = new Toy("Woody", 30.5, 8);
		//System.out.print( myToy.canUse(8) );

		//Toy myToy = new Toy("Link", 11.2, 18);
		//System.out.print( myToy.canUse(15) );

		Toy myToy = new Toy("JoJo", 11.2, -3);
		System.out.print( myToy.canUse( -2 ) );
	}
}