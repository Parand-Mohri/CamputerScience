public class Ex1 {
    public static void main(String[] args){
        int[] a ={5,3,2,6,4,1};
        System.out.println(positionelement(a));
    }
    public static int positionelement(int[]x){
        int produce = 0;
        for(int i = 0; i < x.length; i++){
            produce += x[i] * (i+1);
        }
        return produce;
    }
    public static int[] rotation(int[] a){
        int [] x = new int[a.length];
        int p = 1;
        int min = 0;
        

    }
    
}
