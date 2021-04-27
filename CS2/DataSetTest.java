// package Lab2;
public class DataSetTest
{  public static void main(String[] args)
   {  class PersonMeasurer implements Measurer
      {  public double measurer(Object anObject)
         { Person aPerson = (Person)anObject;
            double heigth = aPerson.getheigth();
            return heigth;
         }
      }
      class BankacounMeasurer implements Measurer {
         public double measurer (Object anObject){
            BankAcount aacount = (BankAcount)anObject;
            double balance = aacount.getbalance();
            return balance; 
         }
      }
      class BankacounFilter implements Filter{
         public boolean accept(Object x){
            BankAcount aacount = (BankAcount)x;
            if (aacount.getbalance() < 1000){
               return true;
            }
            return false;
         }
      }
      class PersonFilter implements Filter {
         public boolean accept(Object x){
            Person aperson = (Person) x;
            return false ;
         }
      }

      Measurer m = new PersonMeasurer();
      Measurer r = new BankacounMeasurer();
      Filter o = new BankacounFilter();
      Filter t = new PersonFilter();
      DataSet aperson = new DataSet(m, t);
      DataSet aacount = new DataSet(r,o);
      aperson.add(new Person("Parand" , 56));
      aperson.add(new Person("Tom" ,40));
      aperson.add(new Person("Jerry" ,78));

      aacount.add(new BankAcount(230));
      aacount.add(new BankAcount(1200));
      aacount.add(new BankAcount(2));
      aacount.add(new BankAcount(1300));
      aacount.add(new BankAcount(1700));
      aacount.add(new BankAcount(53));

      System.out.println("accounts added (have more than 1000 euros)= " + aacount.count());//number of the account that were added
      System.out.println("accounts wanted to be added (had less than 1000 euros ) = " + aacount.wanted());//number of all the accounts that wanted to be add 


      
      System.out.println("average heigth = " + aperson.getAverage());
      Person max = (Person)aperson.getMaximum();
      System.out.println("Maximum heigth = " + max.getname());
   }
}

    

