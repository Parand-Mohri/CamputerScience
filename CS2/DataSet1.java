import java.lang.Comparable;
public class DataSet1 {
    private Comparable maximum;
    private Comparable minimum;
    public DataSet1(){
        maximum ="" ;
        minimum = "";
    }
    public void add(Comparable x ) 
    {
        if (minimum.equals("")){
            minimum = x;
        }
        if (x.compareTo(maximum)> 0)
        {
            maximum = x; 
        }
        if (x.compareTo(minimum)<0)
        {
            minimum = x;
        }
    }
    public Comparable getmaximum()
    {
        return maximum;
    }
    public Comparable getminimum()
    {
        return minimum;
    }
}

