import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main (String[] args) {

        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int accNumber = random.nextInt(9)+1;

        while(true) {

            System.out.println("What is your guess?");
            int userGuess = s.nextInt();

            if (userGuess > accNumber) System.out.println("Too high");
            else if (userGuess < accNumber) System.out.println("Too low!");
            else {

                System.out.println("you got it!");
                break;

            }


        }
    }


}
