import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadingProducts {
	private String fileName;
	private ArrayList<Product> result;

	public ReadingProducts(String name) {
		fileName = name;
	}

	public ArrayList<Product> readProducts(Scanner in) throws IOException
	{ 
		result = new ArrayList<Product>();
		boolean done = false;
		while (!done) { 
			Product p = new Product();
			if (p.read(in))
				result.add(p);
			else done = true;
		}
		return result;   
	}

	public void openProcessFile() {  
		Scanner in = null;
		ArrayList<Product> result = new ArrayList<Product> ();
		try { // select file name
			in = new Scanner(new FileReader(fileName));
			result = readProducts(in);
		}
		catch(FileNotFoundException e)
		{ System.out.println("Bad file name");}
		catch(IOException e)
		{ System.out.println("Corrupted file" + e);}
		finally
		{ 
			if (in != null) 
				try { in.close(); }
				catch(Exception e)
				{ System.out.println("Error closing file"); }
		}
	}

	public ArrayList<Product> getProducts() {
		return result;
	}
}
	