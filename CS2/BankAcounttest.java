public class BankAcounttest {
    public static void main(String[] args){
        try {
            BankAccount parand = new BankAccount(-100); // balance is negative 
        }
        catch(IllegalArgumentException e ){
           e.printStackTrace(); 
        }
        try {
            BankAccount parand = new BankAccount(100);
            parand.deposit(-100); //deposite is negative 
        }
        catch(IllegalArgumentException e ){
           e.printStackTrace(); 
        }
        try {
            BankAccount parand = new BankAccount(100);
            parand.withdraw(200);//withdraw is bigger than balance 
        }
        catch(IllegalArgumentException e ){
           e.printStackTrace(); 
        }
    }
}
