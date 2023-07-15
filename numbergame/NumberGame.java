package numbergame;

import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]) {

        // initialization of maximum tries and score
        int maxTry = 5;
        int score = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Number Guessing Game!" + "\n" + 
        "You have to guess a number between 1 to 100" + "\n" +
        "You have maximum 5 chances to guess correct number");

        // This method is used to generate a random number between 1 to 100
        int originalNumber = 1 + (int) (Math.random() * 100);

        // This for-loop is used to give feedback about guesses and to calculate score
        for (int i = 0; i < maxTry; i++) {

            System.out.print ("\n"+"Guess a number: ");
            int guessedNumber = sc.nextInt();

            if (guessedNumber == originalNumber) {
                System.out.println("Congratulations! you've guessed correct");
                score = 100 - (20 * i);
                break;
            } else if (guessedNumber > originalNumber) {
                System.out.println("Oops! your guess was too high");
            } else if (guessedNumber < originalNumber) {
                System.err.println("Oops! your guess was too low");
            } 

        }

        System.out.println("\n" + "Your score: " + score + "/100" + "\n");

        System.out.println("Right number was: " + originalNumber);

        System.out.println("\n" + "Wanna play again?" + "\n");
        sc.close();
    }
}
