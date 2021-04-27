// import sun.management.MethodInfo;

public class Method {
    public static void main(String[] args){
        int x =2;
        if (method(x) > 0){
            System.out.println("hello");
        }
        else{
            System.out.println("he"); 
        }
    }
    public static void method (int x){
        x = x*2;
        System.out.println(x);
    }
    
}
