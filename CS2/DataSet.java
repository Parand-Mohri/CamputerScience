public class DataSet 
{  
    public DataSet(Measurer aMeasurer , Filter aFilter)
   {  sum = 0;
      count = 0;
      wanted =0;
      maximum = null;
      measurer = aMeasurer;
      delet = aFilter;
   }
   public void add(Object x)
   {
      wanted ++;//all the account that wanted to be added 
      if (!delet.delet(x))
      {
         sum = sum + measurer.measurer(x);
         if (count == 0 || measurer.measurer(maximum) < measurer.measurer(x))
         {
            maximum = x;
         }
         count++;//number of the accounts that were added 
      }     
   }
   public int count(){
      return count;
   }
   public int wanted(){
      return wanted;
   }
   public double getAverage()
   {  if (count == 0)
      {
         return 0;
      } 
      else{
         return sum/count;
      } 
   }
   public Object getMaximum()
   { return maximum; }
   
   private int wanted;
   private double sum;
   private Object maximum;
   private int count;
   private Measurer measurer;
   private Filter delet;
}
