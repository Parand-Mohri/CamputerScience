import java.util.Arrays;

public class Digittransformer {
    public static void main(String[] args){
        long[][] x ={{33,-101,94,12,3},{777,72,54,33040,4}};
        digittransformer(x);

    }
    public static void digittransformer(long[][] a){
        long[][] x = new long[a.length][a[0].length];
        
        
        for (int i =0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                int y = 10;
                int number = 1;
                boolean p = false;
                while(!p){
                    if ((a[i][j] < y && a[i][j] >0)  || (a[i][j] < 0 &&   a[i][j] > -y) ){
                        p = true;
                        x[i][j] = number;

                    }
                    else {
                        number++;
                        y = y * 10;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(x));

    }
    
}
