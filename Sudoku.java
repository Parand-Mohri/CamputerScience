import java.util.Arrays;
public class Sudoku {
    public static void main(String [] args){
        int [][] f = {{0,9,5,0,1,7,0,0,0},{0,0,0,5,0,0,8,0,0},{0,6,0,0,9,0,1,7,0},{0,0,7,0,5,0,0,4,0},{0,0,0,2,0,1,0,0,0},{0,2,0,0,7,0,9,0,0},{0,5,3,0,4,0,0,2,0},{0,0,9,0,0,3,0,0,0},{0,0,0,6,2,0,4,3,0}};
        System.out.println(isFull(f));
        int p = 0;
        boolean []x = computeHints(p,p,f);
        System.out.println(Arrays.toString(x));
        int[] c = collectDigits(x);
        System.out.println(Arrays.toString(c));



    }
    public static boolean isFull(int[][] a){
        boolean x = true;
        for (int i =0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                if (x && a[i][j] == 0){
                    x = false;
                }
            }
        }
        return x;
    }
    public static boolean[] computeHints(int row, int col, int[][] board){
        boolean[] x = {true,true,true,true,true,true,true,true,true,true};
         for (int i= 0; i < board.length; i++ ){
            if (i != col && board[row][i] != 0 ){
                x [board[row][i]] = false;
                // System.out.println(x [board[row][i]]);
                if (i != row && board[i][col] != 0 ){
                    x [board[i][col]] = false;
                // System.out.println(x [board[i][col]]);

                }

            }
         }
        //  if ((row == 0 || row == 3 || row == 6) && (col == 0 || col == 3 || col == 6))





         return x;
    }
    public static int[] collectDigits (boolean[] hints) {
        int count =0;
        for ( int i = 1; i < hints.length; i++){
            if (hints[i]){
                count ++;
            }
        }
        int fuck = 0;
        int [] x= new int[count]; 
        for (int i=1; i < hints.length; i++){
            if(hints[i]){
                x[fuck] = i;
                fuck++;
            }
        }
        return x;

    }
    
}
