import java.util.Arrays;
import java.util.ArrayList;


class Lec7_1_ArrayAndArrayList {
  public static void main(String[] args) {
    System.out.println("2D arrays:");
    System.out.println("2D representation");
    System.out.println("| 255  0  |");
    System.out.println("| 0    64 |");

    int[][] imageArray = {{255,0},{0,64}};
    System.out.println("Array:\n" + Arrays.deepToString(imageArray));
    
    ArrayList<ArrayList<Integer>> imageArrayList= new ArrayList<ArrayList<Integer>>();
    imageArrayList.add(new ArrayList<Integer>(
    Arrays.asList(255,0)));
    imageArrayList.add(new ArrayList<Integer>(
    Arrays.asList(0,64)));
    System.out.println("ArrayList:\n" + imageArrayList);

  
    System.out.println("\n\n3D arrays:");
    System.out.println("3D representation");
    System.out.println("| [255, 0, 0]  [0, 255, 0] |");
    System.out.println("| [0, 0, 0]    [64, 0, 0]  |");
    
    int[][][] imageArray3D = {
                            {{255, 0, 0},{0, 255, 0}},
                            {{0, 0, 0},  {64, 0, 0}} };
    System.out.println(Arrays.deepToString(imageArray3D));  
    
  }
}