import java.util.Scanner;
public class Divisiable{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int x =in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            int z = x % y;
            if (z == 0) {
                System.out.println("your numbers are divisable.");
            }
            else{
                System.out.println("your numbers are not divisable.");
            }
        }
        else{
            int z = y % x;
            if (z==0) {
                System.out.println("your numbers are divisable.");
            }
            else{
                System.out.println("your numbers are not divisable.");
            }
        }
    }
}