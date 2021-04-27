import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        double[][] matrix = {{1.0,2.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
        double[][] matrix2 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
        double[][] x = sum(matrix,matrix2);
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j]  + " ,");
            }
        }
    }
    public static double[][] sum(double[][] a, double[][] b){
        if (a.length == b.length && a[0].length == b[0].length) {
            double[][] x = new double[a.length][a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    x[i][j] = a[i][j] + b[i][j];
                }
            }
            return x;
        }
        else {
            System.out.println("its wrong");

        }

    }
}




