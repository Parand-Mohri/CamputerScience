import java.util.Scanner;
public class IfandElse {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a value for x and y:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z;

        if (x > 1) && (y > 30 ) {
            z = 5;
        }
            else{
                z = 10;
            }
            System.out.println("the value of z is:" + z);
        }
        else {
            System.out.println("x is less than 1!");
        }

    }


}
