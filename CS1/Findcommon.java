public class Findcommon {
    public static void main(String[] args){
        boolean[][] x = {{false,true,false,true,true},{true,false,true,false,false}};
        int i = 0;
        int j = 1;
        System.out.println(findcommon(x, i, j));

    }
    public static boolean findcommon(boolean[][] a, int i, int j){
        boolean f = false;
        int u =0;
        while (u<a[0].length){
            if((a[i][u] == true) && (a[j][u]== true)){
                f = true;
            }
            if (f == false){
                u++;
            }
            else {
                u = a[0].length;
            }
        }
        return f;
    }
}
