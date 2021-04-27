import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        // String[] array = { "x" , "y","xn"};
        // String value = "xn";
        // System.out.println(findIndex(array, value));
        String[][] L = {{"x", "y", "z"}, {"xn", "yn", "z"},{"xn", "yn", "zn"}};
		Boolean[][] L_values = {{null, null, null}, {null, null, null}, {null, null, null}};
		String[] A = {"x", "y", "z"};
        Boolean[] A_values = {null, null, null};
        String primitive = "z";
        boolean value = true ; 
        String primitive2 = primitive + "n";
        boolean value2 = !(value) ; 
        // System.out.println(primitive2 + value2);

        // fillIn(L, L_values, primitive2, value2);

        // System.out.println(Arrays.deepToString(L_values));
        fillIn(L, L_values, primitive2, !(value));
        System.out.println(Arrays.deepToString(L_values));

      
    }
    public static int findIndex(String array[], String value) { 	  
		// [your code here]
		int y =0;
		boolean x = false;
		if ( array.length==0){
			y = -1;
		}
		for (int i = 0; i < array.length;i++){
			if (array[i]== value){
				x= true;
				y = i;
			}
		}
		if (x = false){
			y = -1;
			
		}
		return y;
    }
    public static Boolean[][] fillIn(String[][] L, Boolean[][] L_values, String primitive, Boolean value) {
		// [your code here]
		for (int i =0; i < L.length;i++){
			for (int j =0; j < L[i].length; j++){
				if (L[i][j].equals(primitive)){
					L_values[i][j] = value;
				}
			}
		}
		return L_values;


	}
}
