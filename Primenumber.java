import java.util.Scanner;
public class Primenumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 20:");
        int x =in.nextInt();
        if ((x > 20) || (x < 0))
        {
            System.out.println("your number dowsnt have nessecary conditions, please change your number");
        }
        else {
            if (x == 1 || x == 2 || x== 3 || x==5 || x==7 || x == 11 || x==13 || x==17 || x==19 ){
                System.out.println("your number is a prime number!");
            }
            else {
                System.out.println("your number is not prime number!");
            }
        }

    }
}