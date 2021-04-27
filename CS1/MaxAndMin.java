import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter 5 numbers:");
    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	int n3 = in.nextInt();
    	int n4 = in.nextInt();
    	int n5 = in.nextInt();
    	
    	int max1 = maxOf3(n1,n2,n3);
    	int min1 = minOf3(n1,n2,n3);
    	int largest = maxOf3(max1, n4, n5);
    	int smallest = minOf3(min1, n4, n5);

    	System.out.println("largest: " + largest);
    	
    	System.out.println("smallest: " + smallest);
    }

    public static int maxOf3(int r, int s, int t) {
    	int maxnumber1 = Math.max(r, s);
    	int maxnumber = Math.max(maxnumber1, t);
    	return maxnumber;

	}
    public static int minOf3(int r, int s, int t) {
		int minnumber1 = Math.min(r, s);
		int minnumber = Math.min(minnumber1, t);
		return minnumber;
    }
    
}