public class X{
    public static void main(String[] args){
        Mahshid parand = new Mahshid(1000);
        Mahshid mahshid = new Mahshid(500);
        mahshid.whitdraw(50);

        parand.deposite(20);
        // System.out.println(parand.getBalance());
        System.out.println(parand.transaction());
    }
}