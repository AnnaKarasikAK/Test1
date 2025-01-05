package selfLearning7;

import java.util.Scanner;

public class SelfLearning7_3 {

    public static String inputWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = input.nextLine();
        return word;
    }

    public static boolean doubleLetters(String word) {
        boolean isItDouble = false;
        if (word == null || word.isEmpty() || word.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            for (int i = 0; i <= word.length() - 2; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    return true;
                }
            }
        }
        return isItDouble;
    }
}
