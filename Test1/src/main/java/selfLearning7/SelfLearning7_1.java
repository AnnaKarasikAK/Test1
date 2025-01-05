package selfLearning7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class SelfLearning7_1 {
    public static String input1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array of user-typed words, dividing them by commas: ");
        String listUserWords = input.nextLine();
        return listUserWords;
    }

    public static String input2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array of correctly-typed words, dividing them by commas: ");
        String listCorrectWords = input.nextLine();
        return listCorrectWords;
    }

    public static void correctStream(String listUserWords, String listCorrectWords) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        listUserWords = listUserWords.replaceAll("\\s+", ""); // removes the spaces
        String[] arrayUserWords = listUserWords.split(","); // creates array from the text
        for (int j = 0; j <= arrayUserWords.length - 1; j++) { //checks if there are no empty and not valid words in the user-typed array
            if (arrayUserWords[j] == null || arrayUserWords[j].isEmpty() || arrayUserWords[j].isBlank()) {
                System.out.println("One ot more USER-TYPED words is null or empty");
                exit(0); //if there is an empty/not valid - exits from the method
            }
        }
        System.out.println("The received user-typed words are : " + Arrays.toString(arrayUserWords));

        listCorrectWords = listCorrectWords.replaceAll("\\s+", ""); // removes the spaces
        String[] arrayCorrectWords = listCorrectWords.split(","); // creates array from text
        for (int k = 0; k <= arrayCorrectWords.length - 1; k++) { //check if there are no empty and not valid words in the used-typed array
            if (arrayCorrectWords[k] == null || arrayCorrectWords[k].isEmpty() || arrayCorrectWords[k].isBlank()) {
                System.out.println("One or more CORRECT words is null or empty");
                exit(0); //if there is an empty/not valid - exits from the method
            }
        }
        System.out.println("The received correct words are : " + Arrays.toString(arrayCorrectWords));
        if (arrayUserWords.length == arrayCorrectWords.length) { //check if both arrays have the same number of words
            for (int i = 0; i <= arrayUserWords.length - 1; i++) { //if all the previous ifs are good, compares between two arrays and creates the output array
                if (arrayUserWords[i].equals(arrayCorrectWords[i])) {
                    output.add(1);
                } else {
                    output.add(-1);
                }
            }
            System.out.println(output);
        } else { // if the arrays have different lengths
            System.out.println("The number of entered words is not equal, can't compare the arrays!");
        }
    }

}




// if (names.get(j).equals(names.get(j + 1))) {
//                    names.remove(names.get(j + 1));