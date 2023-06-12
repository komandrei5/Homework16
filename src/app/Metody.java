package app;

import java.util.Random;
import java.util.Scanner;

public class Metody {
    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        int position = source.indexOf(target);
        return position;
    }

    public static String stringReverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        String reversed = stringReverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static void playGuessingGame(String[] words, Random random, Scanner scanner) {
        int wordIndex = random.nextInt(words.length);
        String secretWord = words[wordIndex];
        int wordLength = secretWord.length();
        String guessedWord = "#".repeat(wordLength);

        while (!guessedWord.equals(secretWord)) {
            System.out.println("Enter your guess: ");
            String guess = scanner.next().toLowerCase();

            if (guess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word!");
                break;
            }
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < wordLength; i++) {
                if (i < guess.length() && guess.charAt(i) == secretWord.charAt(i)) {
                    result.append(secretWord.charAt(i));
                } else {
                    result.append("#");
                }
                System.out.println(result);
            }
        }
    }
}
