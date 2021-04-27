import java.util.Scanner;
public class Sumofevenandodd{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("write the lenght of array:");
        int lenght = in.nextInt();
        int[] a = new int[lenght];
        System.out.println("write your numbers:");
        for (int i=0; i < a.length; i++){
            a[i]= in.nextInt();
        }
        System.out.println(evennumbers(a));
        System.out.println(oddnumbers(a));
    }
    public static int evennumbers(int[] a){
        int y=0;
        for (int i = 0; i<a.length; i++){
            if (a[i] % 2 ==0){
                y=a[i]+y;
            }
        }
        return y;
    }
    public static int oddnumbers(int[] a){
        int y=0;
        for (int i = 0; i<a.length; i++){
            if (a[i] % 2 !=0){
                y=a[i]+y;
            }
        }
        return y;
    }

}