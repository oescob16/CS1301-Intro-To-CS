public class MovieMain{

public static void main(String[] args) {
	// Create three new movies, assign the name you want and print them.
	// 	
		Movie movie1, movie2, movie3;
		
		movie1 = new Movie("Avengers: Infinity War", "Action", 120, false);
		movie2 = new Movie("Captain Marvel", "Action", 150, false);
		movie3 = new Movie("Avengers: End Game", "Action", 180, true);
		
		movie1.printMovie();
		movie2.printMovie();
		movie3.printMovie();
	}
}