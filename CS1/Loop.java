import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number:");
        int f =in.nextInt();
        System.out.println("Is your number prime?" + (isPrime(f)));//give a boolean for answer (true: is prime, false: its not)
        System.out.println("There are " + countprimes(f) + " prime numbers between 0 and your number.");

    }
    public static boolean isPrime(int a){
        boolean x = true;
        if (a == 0 || a == 1){
            x=false;
        }
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    x = false;
                }
            }
        }
        return x;
    }

    public static int countprimes(int a){ //give the number of prime numbers that are exist in that interval but doesnt count the original number
        int z=0;
        boolean y = false;
        for (int x = 2; x < a; x++){
            y=isPrime(x);
            if (y==true){
                z++;
            }
        }
        return z;
    }
}
