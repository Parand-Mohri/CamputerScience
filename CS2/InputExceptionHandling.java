import java.util.Scanner;
import java.lang.NumberFormatException;

public class InputExceptionHandling {
  public static void main(String[] args) {
    System.out.print("Introduce a number: ");
    Scanner input = new Scanner(System.in);
    try {
    	String value = input.next();
    	try {
    		int number = Integer.parseInt(value);
			System.out.print(number);	
    	}
    	finally {
    		if (input!=null)
    			input.close();
    	}
	}
	catch (NumberFormatException exception) {
		System.out.print("The expecte input is a number");	
    }
  }
}
