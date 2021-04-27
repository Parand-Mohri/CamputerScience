import java.util.Scanner;
import java.util.Arrays;
public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the width for your first matrix:"); // making the first matrix
        int width1 = in.nextInt();
        System.out.println("enter the hight for your first matrix:");
        int hight1 = in.nextInt();
        double [][] matrix1= new double[width1][hight1];
        System.out.println("enter " + width1*hight1 + " numbers for your first matrix:");
        for (int i = 0; i<matrix1.length; i++){ //initializing new values to our matrix
            for (int j =0; j < matrix1[i].length; j++){
                matrix1[i][j]= in.nextDouble();
            }
        }
        System.out.println("enter the width for your second matrix:");// making the second matrix
        int width2 = in.nextInt();
        System.out.println("enter the hight for your second matrix:");
        int hight2 = in.nextInt();
        double [][] matrix2= new double[width2][hight2];
        System.out.println("enter " + width2*hight2 + " numbers for your second matrix:");
        for (int i = 0; i<matrix2.length; i++){//initializing new values to our second matrix
            for (int j =0; j < matrix2[i].length; j++){
                matrix2[i][j]= in.nextDouble();
            }
        }
        multiplication(matrix1,matrix2); //calling the method for multioication
    }
    public static void multiplication ( double[][] a, double[][] b){
        if (a.length==b[0].length && a[0].length == b.length) { //check whether the width of the first matrix is equal to the height of the second and vice versa
            double x[][] = new double[a.length][a[0].length]; //making new matrix for new values
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    x[i][j] = 0;
                    for (int k = 0; k < b.length; k++) {
                        x[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(x[i][j] + ", ");
                }
            }
        }
        else { // check if the multipication is legal
            System.out.println("the multiplication is not legal: the width of the first matrix is not equal to the height of the second or vice versa!");
        }
    }
}



