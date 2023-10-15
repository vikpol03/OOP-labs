package org.example;

import java.util.Random;
import java.util.Scanner;

public class TASK10 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int targetNumber = drawNumber(random);
    int numberOfGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
        System.out.print("Guess the number (0-100): ");
        int userGuess = scanner.nextInt();
        numberOfGuesses++;

        if (userGuess < targetNumber) {
            System.out.println("The number is greater.");
        } else if (userGuess > targetNumber) {
            System.out.println("The number is lesser.");
        } else {
            System.out.println("Congratulations, your guess is correct!");
            System.out.println("You guessed the number in " + numberOfGuesses + " attempts.");
            break;
        }
    }

        scanner.close();
}

    public static int drawNumber(Random random) {
        return random.nextInt(101);
    }
}
