package app;

import java.util.Random;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void runTwo() {
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter a symbol: ");
        char symbol = scanner.next().charAt(0);
        int occurrenceCount = Metody.findSymbolOccurrence(str, symbol);
        System.out.println("Symbol occurrence count: " + occurrenceCount);
    }
    public void runThree() {
        System.out.print("Enter the source string: ");
        String source = scanner.next();
        System.out.print("Enter the target string: ");
        String target = scanner.next();
        int position = Metody.findWordPosition(source, target);
        System.out.println("Position of the substring in the string: " + position);
    }

    public void runFour() {
        System.out.println("Enter a string: ");
        String str = scanner.next();
        boolean result = Metody.isPalindrome(str);
        System.out.println("Is the string a palindrome? " + result);
    }

    public void runFive() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Metody.playGuessingGame(words, random, scanner);
    }
}
