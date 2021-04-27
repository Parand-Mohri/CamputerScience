public class BankAccount
{  public BankAccount(double initialBalance)
   {  
      if (initialBalance < 0 ) {throw new IllegalArgumentException("initial balance need to be positive");}
      else {balance = initialBalance;}
   }
   public void deposit(double amount)
   {  if (amount < 0){throw new IllegalArgumentException("amount need to be positive ");}
      else {
         double newBalance = balance + amount;
         balance = newBalance;
      }
   }
   public void withdraw(double amount)
   {  if (amount >balance ){throw new IllegalArgumentException("amount need to be less than balance ");}
      else {
         double newBalance = balance - amount;
         balance = newBalance;
      }
   }
   public double getBalance()
   {  return balance;
   }
   private double balance;
}
