import java.awt.Rectangle;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class WritingFile {

	public static void main(String[] args) throws IOException{
		FileWriter writer = new FileWriter("output.txt");
		PrintWriter out = new PrintWriter(writer);
		out.println(29.95); 
		out.println(new Rectangle(5,10,15,25));
		out.print("Hello, World!");
		writer.close();
	}
}

