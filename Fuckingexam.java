public class Fuckingexam {
    public static void main(String[] args){
        int [][] ar = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(checkim(ar));
        System.out.println(biggestim(ar));

    }
    public static boolean checkim(int[][]a){
        boolean x = true;
        for (int i = 0; i < a.length; i++){
            if (a[i][i] != 1){
                x = false;
            }
            for (int j = 0; j<a[i].length; j++){
                if (x && j !=i && a[i][j] != 0){
                    x = false;
                }
            }
        }
        return x;
    }
    public static int biggestim(int[][] a){
        if (checkim(a)){
            return a.length;
        }
        else {
            boolean x = true;
            for ( int p = 1; p < a.length - 2; p++){
                for (int i =0 ; i <a.length-p ;i++ ){
                    int [] newa = new array[i];
                    newa[i]= a[i][i];
                    for (int f = 0; f <= i; f++ ){
                        if (newa[f]!= 1){
                            x =false;
                        }
                    }
                    for (int j = 0; j =< i; j++ ){
                        if (x && j != i && a[i][j] != 0){
                            x = false;
    
                        }break;            
                    }
                    if (!x){
                        return 0;
                    }break;
                    else {
                        return i;
                    }break;
                    
                }
                

            }
            
        }
        
    }
    
}
