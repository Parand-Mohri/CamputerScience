import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Find {

    public static void main(String[] args) {

        try {
            for (int t = 1; t < args.length; t++) {
                FileReader reader = new FileReader(args[t]);
                Scanner filereade = new Scanner(reader);
                int howmanylines = howmanylines(args[t]);
                if (howmanylines == -1) {
                    System.exit(-1); // if our method return -1 we exit the program becaue somthign is wrong. and that make problem in the for loop.
                }
                for (int i = 0; i < howmanylines; i++) {
                    String next = filereade.nextLine();
                    int howmuch = args[0].length();
                    int j = 1;//j go throw our target.
                    for (int p = 0; p < next.length(); p++) { // p go throw our line 
                        if (args[0].charAt(0) == next.charAt(p)) {
                            if (args[0].length() == 1) {
                                System.out.println(next);
                            } else {
                                while (j < howmuch) {
                                    if (args[0].charAt(j) == next.charAt(p + j)) {
                                        j++;
                                        if (j == howmuch) {
                                            System.out.println(next);
                                        }
                                    } else {
                                        j = howmuch;
                                    }
                                }
                            }
                        }
                    }
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Bad file name");
        }

    }

    public static int howmanylines(String t) { // i made this methods to count the lines of each file 
        try {
            //i made new filereader because if i use the same one its go throw the lines i cant go throw them again in my main class. 
            FileReader reader1 = new FileReader(t);
            Scanner file = new Scanner(reader1);
            int countline = 0;
            while (file.hasNextLine()) {
                countline++;
                file.nextLine();
            }
            return countline;
        } catch (FileNotFoundException e) {
            System.out.println("Bad file name");
            return -1;
        }
    }

}
