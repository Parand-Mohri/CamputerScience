public class Recursive {
    public static void main(String[] args) {
        int x = 6;
        sum(x);

    }

    public static void sum(int n) {
        System.out.println(n);
        if (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                sum(n);


            } else {
                n = n * 3 + 1;
                n * sum(n);
            }

        }



    }
}