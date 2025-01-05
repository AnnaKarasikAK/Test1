package selfLearning7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class SelfLearning7_4_1 {


    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public static String scoreInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the final lettered score:");
        String score = input.nextLine();
        return score;
    }

    public static String calculateScores(String score) {
        int[] output = {0, 0, 0};
        score = score.replaceAll("\\s+", ""); //to remove all the spaces
        score = score.toLowerCase(); //to make sure that it is not case-sensitive

        for (int i = 0; i <= score.length() - 1; i++) {
            if (score.charAt(i) == 'a') {
                output[a] = output[a] + 1;
            } else if (score.charAt(i) == 'b') {
                output[b] = output[b] + 1;
            } else if (score.charAt(i) == 'c') {
                output[c] = output[c] + 1;
            } else {
                return "One of the characters is not corresponding to the person";

            }
        }

        return Arrays.toString(output);
    }
}

