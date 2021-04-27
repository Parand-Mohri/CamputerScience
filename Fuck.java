import java.util.Arrays;

public class Fuck {
    public static void main(String[] args)
    {
        int []x = {6,5,3,7,5,7,12,5,3,6,2,6,4};
        UpperBounds(x);
        
    }
    public static void UpperBounds(int[] p)
    {
        int [] x = new int[p.length+1]; 
        for(int i = 0; i<p.length; i++)
        {
            x[i+1] = p[i];
        }
        System.out.println(Arrays.toString(x));
        for (int i = 1; i < x.length; i++)
        {
            for (int j = 1; j< x.length -1 - (i-1); j++ )
            {
                if (x[j]<x[j+1])
                {
                    int y = x[j];
                    x[j] = x[j+1];
                    x[j+1] = y;
                }
            }
        }
        System.out.println(Arrays.toString(x));

        int upperbound = 0; 
        for (int i = 1; i < x.length; i++)//sorted nodes degree array 
        {
            if (upperbound < Math.min(x[i]+1, i))
            {
                upperbound = Math.min(x[i]+1, i);
            }
        }
        System.out.println(upperbound);
        
    }   
}
    
   

     //     Class mname = new Class("Parand Mohri");
    //      System.out.println(mname.getname());
    //      mname.setname("Ardibehesht");
    //      System.out.println(mname.getname());
 
    //  }
    //  public Class (String myname){
    //     name = myname;
    // }
    // public String getname(){
    //     return name;

    // }
    // public void setname(String newname){
    //     name = newname;
    // } 
    // private String name;
    