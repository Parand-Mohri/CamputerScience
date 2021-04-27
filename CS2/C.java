public class C extends B {
    public static void main(String[] args){
        A b1 = new B();
        A c1 = new C();
        B temp = (A) b1;
        b1 = c1; 
        c1 = temp;

    }
    
}
