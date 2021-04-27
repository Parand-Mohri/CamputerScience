//import java.util.Array;
public class Findtotal {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int y = 6;
        findtotal(y, x);
    }

    public static boolean findtotal(int goal, int[] a) {
        boolean b = false;
        if (goal == 0) {
            return true;
        } else if (a.length == 0) {
            return false;
        } else {
            int newgoal = goal - a[0];
            int[] newa = new int[a.length - 1];
            System.arraycopy(a, 1, newa, 0, a.length - 1);
            if (findtotal(newgoal, newa)) {
                System.out.println(a[0] + "");
            } else {
                return findtotal(goal, newa);
            }
        }
    }
}
