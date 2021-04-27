public class DataSet1Test {
    public static void main(String[] args){
        String firstString = "Parand";
        String secondString = "apple";
        DataSet1 data = new DataSet1();
        data.add(firstString);
        data.add(secondString);
        System.out.println(data.getmaximum());
        System.out.println(data.getminimum());

    } 
    
}
