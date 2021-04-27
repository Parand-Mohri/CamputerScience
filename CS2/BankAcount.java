public class BankAcount
{
    public static void main(String[] args)
    {
        
        BankAcount myacount = new BankAcount(1000);
        myacount.deposit(50);
        myacount.deposit(50);
        myacount.deposit(50);
        myacount.deposit(50);
        myacount.withdrawal(50);
        myacount.deposit(50);
       
        BankAcount who = new BankAcount(500);


        who.withdrawal(10);
        who.deposit(10);
        who.deposit(10);
        who.deposit(10);
        who.withdrawal(10);
        who.withdrawal(10);
        myacount.deposit(50);
        System.out.println(myacount.getbalance());
        // myacount.deductMonthlyCharge();
        System.out.println(myacount.getbalance());
        System.out.println(who.getbalance());
        // who.deductMonthlyCharge();
        System.out.println(who.getbalance());
        myacount.deposit(50);
        myacount.withdrawal(50);
        myacount.deposit(50);
        myacount.withdrawal(50);
        System.out.println(myacount.getbalance());
        // myacount.deductMonthlyCharge();
        System.out.println(myacount.getbalance());
        System.out.println(global);

    }
    public BankAcount(double nbalance)
    {

        deductMonthlyCharge();
        count =0;//every time we add new bankacount we need to start counting again.
        balance = nbalance;
        accountnumber =  ++number;//give the account number to the banckacount. "Exercise 2"
        transcription("BanckAcount" + accountnumber +":         was added with  " + balance + "euros \n" );

    }
    public void withdrawal(double money)
    {
        balance -= money;
        charge = ++count;//every time this method is executed we add 1 to the count(charge). 
        transcription("BanckAcount" + accountnumber +":         withdrawal      " + money + "euros \n" );
        //every time someone use this method we add this information to global string "Exercise 2"
    }
    public void deposit(double money)
    {
        balance+=money;
        charge = ++count;//every time this method is executed we add 1 to the count(charge). 
        transcription("BanckAcount" + accountnumber +":         deposit         " + money + " euros \n" );
        //every time someone use this method we add this information to global string "Exercise 2"
    }
    public double getbalance()
    {
        return balance;
    }
    public void deductMonthlyCharge() // this method going to count and charge the customers for deposit and withdrawal from "Exercise 1"
    {
        if (charge > 3){ //they can do transactions 3 times free in a month so if they use it more than 3 times we need to charge them.
            charge-=3;//take account the free times.
            charge*=5; // 5 is the amount of money that we are going to charge the customers 
            balance -= charge;
        }
        count = 0;// this is because every time we deduct the monthly charge then we reset the count to strat over 
    }
    public String transcription(String what) //this method save all the transaction "Exercise 2"
    {
        global += what; 
        return global;
    }
    

    private double balance;
    private static int count = 0; //count the number of transaction that each person did "Exercise 1"
    private int charge;//save the number of transaction that each person did "Exercise 1"
    private static int number =0;// give a number to each account "Exercise 2"
    private int accountnumber;//save the number of each account "Exercise 2"
    private static String global = "";// the string that save all the transactions "Exercise 2"

}