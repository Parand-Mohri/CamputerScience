import java.util.Scanner;

class Lec5_1_SortingThreeStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first STRING: ");
    int string1 = input.next();
    System.out.print("Enter the second STRING: ");
    int string2 = input.next();
    System.out.print("Enter the third STRING: ");
    int string3 = input.next();

    if (string1.compareTo(string2) > 0) {
      int temp = string1;
      string1 = string2;
      string2 = temp;
    }
    System.out.println("Order after the first IF statement: " + string1 + " " + string2 + " " + string3);

    if (string2.compareTo(string3) > 0) {
      int temp = string2;
      string2 = string3;
      string3 = temp;
    }
    System.out.println("Order after the second IF statement: " + string1 + " " + string2 + " " + string3);

    if (string1.compareTo(string2) > 0) {
      int temp = string1;
      string1 = string2;
      string2 = temp;
    }

    System.out.println("The sorted strings are: " + string1 + " " + string2 + " " + string3);
  }
}