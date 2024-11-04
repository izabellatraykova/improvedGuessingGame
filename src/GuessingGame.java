import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!\nEnter a number from 1 to 100 to attempt and guess the set number. \nYou will be given instructions to help you guess the number if the one you have entered is too low or too high. \nYou will be able to quit the game at any time, if you simply type in 'Quit'. \nHave fun playing!");
        System.out.println("Please enter a number between 1 and 100: ");

        Random rand = new Random();
        int number = 0;
        int randomNumber = rand.nextInt(100) + 1;
        int attempts = 0;

        while (number != randomNumber) {
            if (reader.hasNextInt()) {
                number = reader.nextInt();
            }
            else {
                String input = reader.next();
                if (input.equals("Quit")){
                    System.out.println("You have chosen to quit the game!\nThe correct number is " + randomNumber);
                    System.exit(0);
                }
                if (input.equals("quit")) {
                    System.out.println("You have chosen to quit the game!\nThe correct number is " + randomNumber);
                    System.exit(0);
                }
                if (input.equals("Quit!")) {
                    System.out.println("You have chosen to quit the game!\nThe correct number is " + randomNumber);
                    System.exit(0);
                }
                if (input.equals("quit!")) {
                    System.out.println("You have chosen to quit the game!\nThe correct number is " + randomNumber);
                    System.exit(0);
                }
                else{
                    System.out.println("Error: '" + input + "' is not a valid number. \nTry again.");

                }
            }
            if (number > randomNumber) {
                System.out.println("Guess lower!");
            }
            if (number < randomNumber) {
                System.out.println("Guess higher!");
            }
            attempts = attempts+1;
            System.out.println("You have made " + attempts + " attempts!");
        }

        }
    }