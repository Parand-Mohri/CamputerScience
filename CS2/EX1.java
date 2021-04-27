import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EX1 {
    public static void main(String[] args) {
        System.out.print("intruduce a file name:");
        Scanner input = new Scanner(System.in);
        try {
            String filename = input.nextLine();
            FileReader reader = new FileReader(filename);
            Scanner filereade = new Scanner(reader);
            ArrayList<String> input1 = new ArrayList<String>();// i made this arraylist and copy all the lines of the file in it so i can count the words and characters with this array 
            int countline = 0;
            int countwords = 0;
            int countchar = 0;//in number of characters im counting the other symboles too for example in report.txt im counting "," as a  character.
            while (filereade.hasNextLine()) {
                countline++;
                input1.add(filereade.nextLine());
            }
            for (int i = 0; i < input1.size(); i++) {
                countwords++;
                for (int j = 0; j < input1.get(i).length(); j++) {
                    if (input1.get(i).charAt(j) != ' ') {//if its not '' we add one to characters and if its '' that means we finish one word and we add one to the words 
                        countchar++;
                    } else {
                        countwords++;
                    }
                }
            }
            System.out.println("number of words = " + countwords);
            System.out.println("number of char = " + countchar);
            System.out.println("number of lines = " + countline);
        } catch (FileNotFoundException e) {
            System.out.println("Bad file name");
        } finally {
            input.close();
        }
    }
}
