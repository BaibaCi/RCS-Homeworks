import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] elements = {"Rock", "Paper", "Scissors"};
        String result = elements[new Random().nextInt(elements.length)];
        System.out.println(result);

        while(true) {
            System.out.println("Choose: Rock, Paper, Scissors");

            String userChoice = scan.nextLine();
            if(userChoice.equals(result)) {
                System.out.println("It' s a draw!!");
            } else if(userChoice.equals("Rock") && result.equals("Scissors")) {
                System.out.println("You won!");
            } else if(userChoice.equals("Scissors") && result.equals("Paper")) {
                System.out.println("You won!");
            } else if(userChoice.equals("Paper") && result.equals("Rock")) {
                System.out.println("You won!");
            } else if(userChoice.equals("Paper") && result.equals("Scissors")) {
                System.out.println("You lost!");
                break;
            } else if(userChoice.equals("Scissors") && result.equals("Rock")) {
                System.out.println("You lost!");
                break;
            } else if(userChoice.equals("Rock") && result.equals("Paper")) {
                System.out.println("You lost!");
                break;
            } else {
                System.out.println("???");
            }
        }

    }
}