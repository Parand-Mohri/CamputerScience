import java.util.Scanner;
import java.util.Arrays;

public class Invitation {
  public String[] guestList = {"Tom", "Lara", "Michael", "Sophie"};

  public void Invitation () {
    
  }

  public int whichTable(String person, String[] list) throws NotInTheListException {
    if (!Arrays.asList(list).contains(person))
      throw new NotInTheListException("Are you in the correct party?");
    System.out.println("Welcome to the party!");
    
    return Arrays.asList(list).indexOf(person);
  }  

  public static void main(String[] args) {
    Invitation guest = new Invitation();
    System.out.println("What is your name?");
    Scanner input = new Scanner(System.in);
    String name = input.next();
    try {
      try {
        int table = guest.whichTable(name, guest.guestList);
        System.out.println("Your seat is at table " + table);
      }
      catch(NotInTheListException exception) {

      }
      System.out.print("Next!");
    }
    finally {
      input.close();
    }
  }
}
