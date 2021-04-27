import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers;");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("your first number is: " + a );
        System.out.println("your second number is: " + b);
        System.out.println("");
        System.out.println("Now we switch them. ");
        int z;
        z = a;
        a = b;
        b = z;
        System.out.println("your first number is: " + a  );
        System.out.println("your second number is: " + b);
    }
}