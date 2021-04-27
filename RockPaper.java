import java.util.Scanner;
public class RockPaper{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Play");
        String player = in.next();
        player = player.toUpperCase();
        int x = (int)(Math.random()*4);
        String camputer = "f";
        switch (x) {
            case 0: camputer = "R";break;
            case 1: camputer = "P";break;
            case 2: camputer = "S";break;
            case 3: camputer = "L";break;
            case 4: camputer = "O";break;
        }
        System.out.println("Computer plays : " + camputer);
        switch (player){
            case "R": switch (camputer){
                case "R": System.out.println("Its a tie!");break;
                case "P": System.out.println("YOU LOOSE!");break;
                case "S": System.out.println("YOU WIN!");break;
                case "L": System.out.println("YOU WIN!");break;
                case "O": System.out.println("YOU LOOSE!");break;
            }break;
            case "P": switch (camputer){
                case "R": System.out.println("YOU WIN!");break;
                case "P": System.out.println("Its a tie!");break;
                case "S": System.out.println("YOU LOOSE!");break;
                case "L": System.out.println("YOU LOOSE!");break;
                case "O": System.out.println("YOU WIN!");break;
            }break;
            case "S": switch (camputer){
                case "R": System.out.println("YOU LOOSE!");break;
                case "P": System.out.println("YOU WIN!");break;
                case "S": System.out.println("Its a tie!");break;
                case "L": System.out.println("YOU WIN!");break;
                case "O": System.out.println("YOU LOOSE!");break;
            }break;
            case "L": switch (camputer){
                case "R": System.out.println("YOU LOOSE!");break;
                case "P": System.out.println("YOU WIN!");break;
                case "S": System.out.println("YOU LOOSE!");break;
                case "L": System.out.println("Its a tie!");break;
                case "O": System.out.println("YOU WIN!");break;
            }break;
            case "O": switch (camputer){
                case "R": System.out.println("YOU WIN!");break;
                case "P": System.out.println("YOU LOOSE!");break;
                case "S": System.out.println("YOU WIN!");break;
                case "L": System.out.println("YOU LOOSE!");break;
                case "O": System.out.println("Its a tie!");break;
            }
        }

    }
}