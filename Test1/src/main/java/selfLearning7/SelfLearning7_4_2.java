// Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system. A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital letters, return an array of the players' scores.

// For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points, and Charlotte scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C. So the array [3, 2, 5] should be returned.

// Examples
// calculateScores("A") ➞ [1, 0, 0]

//calculateScores("ABC") ➞ [1, 1, 1]


package selfLearning7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class SelfLearning7_4_2 {
//    public static final int a = 0;
//    public static final int b = 1;
//    public static final int c = 2;


    public static String scoreInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the final lettered score:");
        String score = input.nextLine();
        return score;
    }

    public static void calculateScores(String score) {
        int a=0;
        int b=0;
        int c=0;
        score = score.replaceAll("\\s+", ""); //to remove all the spaces
        score = score.toLowerCase(); //to make sure that it is not case-sensitive
        System.out.println(score.toString());

        for (int i = 0; i <= score.length() - 1; i++) {
            if (score.charAt(i) == 'a') {
                a++;
            } else if (score.charAt(i) == 'b') {
                b++;
            } else if (score.charAt(i) == 'c') {
                c++;
            } else{
                System.out.println("One of the characters is not corresponding to the person");
                exit(0);
            }
        }
        ArrayList<Integer> output = new ArrayList<Integer>();
        output.add(0, a);
        output.add(1, b);
        output.add(2, c);
        System.out.println(output.toString());

//        for(Integer outputs: output){
//            System.out.print(outputs + " ");
//        }

    }


}

