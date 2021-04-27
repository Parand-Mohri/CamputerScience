import java.util.Scanner;
import java.io.IOException;
import java.io.EOFException;

public class Product
{ 
	public boolean read(Scanner in) throws IOException {    
		if(!in.hasNext()) return false;
		name = in.nextLine();
		if (name == null) return false;
		if (!in.hasNext()) throw new EOFException("Missing price");
		String inputLine = in.nextLine();
		price = Double.parseDouble(inputLine);
		if (!in.hasNext()) throw new EOFException("Missing score");
		inputLine = in.nextLine();
		score = Integer.parseInt(inputLine);
		
		return true;
	}

	public String name;
	private double price;
	private int score;
}