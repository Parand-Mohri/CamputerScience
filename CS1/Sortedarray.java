import java.util.Scanner;
import java.util.Arrays;
public class Sortedarray {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 5, 6};
        int y = 3;
        addvalue(x,y);

    }

    public static int[] addvalue(int[] a, int z) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            if (z > a[i]) {
                b[i] = a[i];
            } else {
                b[i] = z;
                for (int j = i; j < a.length; j++){
                    b[j+1] = a[j];
                }
                break;

            }

        }
        if (b[b.length-1] == 0){
            b[b.length-1] = z;
        }
        System.out.println(Arrays.toString(b));
        return b;
    }
}




