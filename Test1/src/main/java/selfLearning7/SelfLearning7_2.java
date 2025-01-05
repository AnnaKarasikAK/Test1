package selfLearning7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class SelfLearning7_2 {

    public static String input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the person's first and last names:");
        String personsName = input.nextLine();
        return personsName;
    }

    public static void nameShuffle(String personsName) {
        String[] firstLast = personsName.split(" "); // creates array from the text
        if (firstLast.length < 2) {
            System.out.println("Person's first or last name were not entered, unable to proceed");
            exit(0);
        }
        for(int j=0; j<=firstLast.length-1; j++){
            firstLast[j]=firstLast[j].trim();
            if(firstLast[j].isBlank() || firstLast[j].isEmpty()){
                System.out.println("Remove the excess of spaces in the input!");
                exit(0);
            }
        }
        if (firstLast.length > 2) {
            System.out.println("Too many personal names were entered, unable to proceed");
            exit(0);
        }
        for (int i = firstLast.length-1; i>=0 ; i--) { //checks if there are no empty and not valid words in the user-typed array
            System.out.print(firstLast[i]);
            System.out.print(" ");
        }
    }
}
