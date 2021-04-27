import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.NumberFormatException;

public class NotInTheListException extends RuntimeException {

	public NotInTheListException() {

  }

  public NotInTheListException(String reason) {
    System.out.println(reason);
  }
}
