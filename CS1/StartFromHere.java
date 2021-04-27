import java.util.Scanner;

public class StartFromHere {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		// Tell the user what you want 
		System.out.println("Please type in the radius of the circle");
		
		// Collect the input
		int radius = in.nextInt();


		// Give some output;
		System.out.println("This is the area of the circle: " + (Area (radius)));
		
	}
	public static double Area(int x){
		double y = x * x * 3.14;
		return y;
	}

}