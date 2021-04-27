import java.awt.Rectangle;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class WritingFileArg {

	public static void main(String[] args) { 

		System.out.println(args[0]);
	try {
		FileWriter writer = new FileWriter(args[0]);
		PrintWriter out = new PrintWriter(writer);
		out.println(29.95); 
		out.println(39.05); 
		writer.close();

		FileReader reader = new FileReader(args[0]);
		BufferedReader in = new BufferedReader(reader);
		String inputLine = in.readLine();
		double x = Double.parseDouble(inputLine);
		System.out.println(x);
		inputLine = in.readLine();
		x = Double.parseDouble(inputLine);
		System.out.println(x);
		reader.close();
		}
		catch(Throwable e){ System.out.println("ourError");}
	} // to run the program type "java readWrite io.txt"

}