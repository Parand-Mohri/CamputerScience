import java.util.Scanner;
public class TAsalary{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your salary:");
        double salary = in.nextDouble();
        System.out.println("enter the houres that you work:");
        int houres = in.nextInt();
        System.out.println("your going to get " + (Howmuch(salary, houres)) + " Euros!");

    }
    public static double Howmuch(double x, int y){
       if (y > 8){
           double z = x * 8;
           y = y - 8;
           x = x * 1.5;
           z = z + (y * x );
           return z;
       }
       else {
           double money = x * y;
           return money;
       }


    }
}