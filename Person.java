public class Person {
    public Person(String Nname, double Nheight ){
        name = Nname;
        height = Nheight;
    }
    private String name;
    private double height;
}
public interface Measurer
{
     double measurer(Object anObject);
}
// public interface Filter 
// {
//     boolean accept(Object x);
// }

public class DataSet
{  public DataSet(Measurer aMeasurer)
   {  sum = 0;
      count = 0;
      maximum = null;
      measurer = aMeasurer;
    //   accept = aFilter;
   }
   public void add(Object x)
   {  sum = sum + measurer.measure(x);
      if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
        {
            maximum = x;
            count++;
        }
   }
   public double getAverage()
   {  if (count == 0) return 0;
      else return sum / count;
   }
   public Object getMaximum()
   { return maximum; }
   private double sum;
   private Object maximum;
   private int count;
   private Measurer measurer;
//    private Filter accept;
}
//    public Dataset(Person x){
// }
// public void tallest(Person x)
// {
//     if (max.height < x.height)
//     {
//         max = x;
//     }
// } 
// public String whostallest()
// {
//    return max.name;
// }
// public void max(Person x )
// {
//     average = average + x.height;
//     count++;
// }
// public double average()
// {
//     return average/count; 
// }
// private Person max;
// private double average;
// private int count = 0;
// }