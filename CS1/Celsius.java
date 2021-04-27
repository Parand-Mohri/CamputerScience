import java.util.Scanner;
public class Celsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please write the temperature in Fahrenheit:");
        double Fahrenheit = in.nextDouble();
        System.out.println(Celsius(Fahrenheit));
    }
    public static double Celsius(double a){
        double b = (a - 32) * 5/9;
        return b;
    }
}