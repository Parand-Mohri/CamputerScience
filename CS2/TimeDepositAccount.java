public class TimeDepositAccount extends BankAcount
{
    private double intrestrate;
    private static int penalty = 10;
    private int numberofmonth;
    public TimeDepositAccount (double rate, int month, double nbalance )
    {
        super(nbalance);
        intrestrate = rate;
        numberofmonth = month;
    }
    public void addintrest(){
        double intrest = getbalance() * intrestrate / 100;
        deposit(intrest);
    }
    public void whitdraw(double money)
    {
        if (numberofmonth > 0)//if the nummberofmonths are bigger than zero that mean the person shouldnt withdrawal so we take out penalty
        {
            super.withdrawal(penalty);
            super.withdrawal(money);
        }
        else //if not we just whitdrawl 
        {
            super.withdrawal(money);
        }
    }
}