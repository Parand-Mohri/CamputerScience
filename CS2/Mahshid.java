import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Mahshid {

	public static void main(String[] args) {
		int lineNumber = 0;
		
		Scanner myReader = new Scanner(System.in);
		System.out.println("please choose your file");
		
		try {
	
			String fileName = myReader.nextLine();
			FileReader reader = new FileReader(fileName);
			
			Scanner fileReader = new Scanner(reader);
			while(fileReader.hasNextLine()) {
                lineNumber++;
                fileReader.nextLine();
			}
			
			System.out.println(lineNumber);
			
		} catch	(FileNotFoundException e) {
			System.out.println("Bad file name");
		} finally {
			myReader.close();
		}
		

	}

}