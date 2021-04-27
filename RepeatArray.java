import java.util.Arrays;

public class RepeatArray {
    public static void main(String[] args){
        int [] a = {1,2,3};
        repeatarray(a);

    }
    public static void repeatarray(int[] ar){
        int x = 0;
        for(int i =0; i<ar.length; i++){
            if(ar[i]>0){
                x = x +  ar[i];
            }
        }
        int [] array = new int[x];
        int index= 0;
        for (int i = 0;i<ar.length; i++ ){
            for (int j = 0; j<ar[i]; j++){
                array[index++] = ar[i];
            }
            
        }
        System.out.println(Arrays.toString(array));
    }
    
}
