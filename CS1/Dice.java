import java.util.Scanner;
public class Dice{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of sides of your Dice:");
        int side =in.nextInt();
        int roll = (int)(Math.random()* side + 1);
        System.out.println(roll);
    }
}
