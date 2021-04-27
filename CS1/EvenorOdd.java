import java.util.Scanner;
public class EvenorOdd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a value for x and y:");
        int x = in.nextInt();
        x = x % 2;
        int y = Math.random()*9;
        if (y == 9){
            if (x == 0) {
                System.out.println("your number is odd.");
            } else {
                System.out.println("your number is even");
            }
        }
        else {
            if (x == 0) {
                System.out.println("your number is even.");
            } else {
                System.out.println("your number is odd");
            }
        }






    }
}
