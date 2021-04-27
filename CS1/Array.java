
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0 ,5.0, 6.0},{7.0, 8.0, 9.0},{10.0, 11.0,12.0}};
//        double[][] matrix = {{1.0, 2.0, 3.0,4.0}, {5.0, 6.0, 7.0, 8.0}, { 9.0,10.0, 11.0,12.0}};
//        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0 ,5.0, 6.0},{7.0, 8.0, 9.0}};
//        double[][] matrix = {{1.0, 2.0, 3.0,4.0}, {5.0, 6.0, 7.0, 8.0}, { 9.0,10.0, 11.0,12.0},{ 13.0,14.0, 15.0,16.0}};
//        double[][] matrix = {{1.0, 2.0, 3.0,4.0}, {5.0, 6.0, 7.0, 8.0}, { 9.0,10.0, 11.0,12.0},{ 13.0,14.0, 15.0,16.0},{ 17.0,18.0, 19.0,20.0}};
//        double[][] matrix = {{1.0, 2.0, 3.0, 4.0, 5.0}, {6.0, 7.0, 8.0, 9.0, 10.0}, {11.0, 12.0, 13.0, 14.0, 15.0}, {16.0, 17.0, 18.0, 19.0, 20.0}};
        int [] b = {0,0,0,0,0,0,0,1,2,2,2,3};
        int g = 3;
//        System.out.println(allnumberwithin(b,g));

        diagonalPrint(matrix);
    }

    public static void diagonalPrint(double[][] a) {
        int b = a.length;
        double[] y = new double[a.length * a[0].length];//new array to store numbers in the new places
        int f = y.length - 1;
        int j = 0;
        int g = 0;
        for (int i = 0; i < a.length; i++) {
            b = b - 1;
            j = j +i;
            f= f-i;
            y[j] = a[i][g]; // print all number in first column in the right place
            y[f] = a[b][a[0].length - 1];// print all number in last column in the right place

            int p = i;
            int u = j;
            int h = g;
            while (p > 0 && h < a[0].length - 1) { // this loop prints all the number in the middle rows with using the numbers in first column.
                // for example(in a [3][4]) matrix if our number in column 1 second row is 5 this loop use that to come to the number 2 in first row second column that should be printed after 5
                --p;
                ++h;
                u++;
                y[u] = a[p][h];
            }
            int m = b;
            int n = f;
            int c = a[0].length - 1;
            while (m < a.length - 1 && c > 0) {// this loop prints all the number in the middle rows with using the numbers in last column. (because all the number cant be printed with loop above.
               // for example(in a [3][4]) if the number in first row and last colum is 4 this loop use that to come to 7 in second row third colum that should be printed before 4.
                ++m;
                --c;
                n--;
                y[n] = a[m][c];
            }
            g = 0;
        }
        System.out.println(Arrays.toString(y));
    }


    public static int allnumberwithin(int[] a, int k) {
        if (a.length == 0) {
            return 0;
        } else if (k < 0) {
            return 0;
        } else if (a.length < k) {
            return 0;
        } else if (allther(a,k) == false) {
            return 0;    // from first if until here there are just the conditions that if exist our method should print 0. (that mean there are no places that have all numbers between 0 to k-1 in our array )
        } else {
            boolean g = false;
            int y = k;
            while (y <= a.length){
                int possible = (a.length -y)+1; // this calculate all the possible arrays with the length y that can be exist in our target array
                //for example if we have an array with the length 7 = {0,1,2,3,4,5,6} there is 5 possible ways that we can make an array with the length 3. whitout changing the positions of elements. {0,1,2}/ {1,2,3}/{2,3,4}/{3,4,5}/{4,5,6}
                int i = 0;
                while (i<possible){ // this loop make all those possible arrays that we found above first with length = to k and then if it doesnt work increase k, but because we cant change k we copy that in y and increase y instead.
                    int []x = new int [y];
                    System.arraycopy(a, a[i], x, 0, y);
                    for (int j = 0; j < y; j++ ){
                        x[j]=a[i];
                        i++;
                    }
                    if ((allther(x, k) == true) && (alltherright(x,k)==true)){ // this loop check whether each of those small array can be the array that we want and if so print the length
                        i = possible;
                        g= true;
                        return y;

                    }

                }
                if (g== true ){
                    y=a.length+1;
                }
                else{
                    y++;
                }

            }
            return 0;
        }

    }


    public static boolean allther(int [] a, int k){ // this method check whether all the number needed (0-(k-1)) are exist in our array.
        boolean e = false;
        if (k> a.length){
            e=false;
        }
        else {
            int[] monitor = new int[a.length ];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < k) {
                    monitor[a[i]] = 1;
                }
            }
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum = sum + monitor[i];
            }
            if (sum == k) {
                e = true;
            }
        }
        return e;// return true if all the number between 0 and k-1 exist in the array.

    }
    public static boolean alltherright(int []a , int k){ //this method check whether only the number that we need exist in our array or there are other numbers too.
        boolean x = true;
        for (int i = 0; i < a.length; i++){
            if (a[i] >= k){
                x = false;
            }
        }
        return x; // return true if all the number in array are less than k and bigger than 0;
    }
}











