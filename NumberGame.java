package CODSOFT;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.print("Enter the minimum value for the range: ");
	        int minRange = scanner.nextInt();
	        System.out.print("Enter the maximum value for the range: ");
	        int maxRange = scanner.nextInt();

	        final int MAX_ATTEMPTS = 5;
	        Random random = new Random();
	        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
	        int attempts = 0;
	        boolean hasGuessed = false;

	        System.out.println("Guess a number between " + minRange + " and " + maxRange + ".");

	        while (attempts < MAX_ATTEMPTS) {
	            System.out.print("Attempt " + (attempts + 1) + " - Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                hasGuessed = true;
	                break;
	            }
	        }

	        if (hasGuessed) {
	            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	        } else {
	            System.out.println("Sorry, you did not guess the number. The correct number was " + numberToGuess + ".");
	        }

	        scanner.close();
	    }
	}



