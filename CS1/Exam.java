// import java.util.Scanner;
public class Exam{
    public static void main(String[] args){
    
        int [][] ar = {{1,0},{0,1}};
        System.out.pritnln(checkim(ar));
        
        

    }
    public static boolean checkim(int[][] a){
        boolean x = true;
        for (int i =0; i<a.length;i++);{
            if (a[i][i] !=1){
                x = false;
            }

        }
        return x;
    }
}