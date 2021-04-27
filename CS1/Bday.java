import java.util.Scanner;
public class Bday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 9;
        int y = 12;
        System.out.println("please enter your name:");
        String z = in.nextLine();
        System.out.println("please enter your birthday month:");
        int i = in.nextInt();
        System.out.println("please enter your birthday day:");
        int r = in.nextInt();
        System.out.println("My birthday is " + x + "/" + y + " and " + z +"'s is " + i + "/" + r );
    }
}