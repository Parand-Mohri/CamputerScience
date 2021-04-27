import java.util.Arrays;

public class Removeall {
    public static void main(String[] args){
        int a[] ={4,2,-3,2,1};
        int x = 2;
        int [] o = removeall(x, a);
        System.out.println(Arrays.toString(o));
        

    }
    public static int[] removeall(int x, int[] a){
        int count = 0;
        for (int i =0; i < a.length; i++){
            if(a[i] == x){
                count ++;
            }
        }
        int[] p = new int[a.length-count];
        int index = 0;
        for (int i =0; i < a.length; i++){
            if(a[i] != x){
                p[index++] = a[i];
            }
        }
        return p;
    }
    
}
