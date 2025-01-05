package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class SelfLearn5 {
    public boolean has22() {
        boolean contains22 = false;

        int[] numbers = {2, 2, 1, 2, 3, 34, 2, 0, 22, 2, 20};

        for (int i = 0; i <= numbers.length - 2; i++) {
            if (numbers[i] == numbers[i + 1]) {
                contains22 = true;
                break;
            }
        }
        return contains22;
    }

    public boolean lucky13() {
        boolean isItLucky = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter required names, dividing them by commas: ");
        String listNumbers = input.nextLine();

        listNumbers = listNumbers.replaceAll("\\s+", "");
        String[] arrayNumbers = listNumbers.split(",");
        int size = arrayNumbers.length;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(arrayNumbers[i]);
        }
        System.out.println("The received numbers are : " + Arrays.toString(numbers));

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                isItLucky = false;
            }
        }
        return isItLucky;
    }

    public String maxTriple2() {
        int[] numbers = {};
        String max = "";
        int size = numbers.length;
        if (size % 2 == 0) {
            max = "The array has even length";
        } else {
            if (numbers[0] == numbers[size - 1] || numbers[0] == numbers[(size - 1) / 2] || numbers[size - 1] == numbers[(size - 1) / 2]) {
                max = "At least two of the compared values are equal";
            } else {
                if (numbers[0] > numbers[size - 1] && numbers[0] > numbers[(size - 1) / 2]) {
                    max = Integer.toString(numbers[0]);
                } else if (numbers[size - 1] > numbers[0] && numbers[size - 1] > numbers[(size - 1) / 2]) {
                    max = Integer.toString(numbers[size - 1]);
                } else {
                    max = Integer.toString(numbers[(size - 1) / 2]);
                }
            }
        }
        return max;
    }


    public boolean arrowFront9() {
        boolean isThere9 = false;
        int[] numbers = {19, -12, 0, 15, 7, 9};

        if(numbers.length >=4) {
            for (int i = 0; i <= 3; i++) {
                if (numbers[i] == 9) {
                    isThere9 = true;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i <= numbers.length-1; i++) {
                if (numbers[i] == 9) {
                    isThere9 = true;
                    break;
                }
            }
        }


        return isThere9;
    }

    public int[] square(){

        int[] list = {};
        for(int i=0; i<=list.length-1; i++){
            list[i] = list[i]*list[i];
        }
        for(int i = 0; i< list.length; i++){
            System.out.println(list[i]);
        }
        return list;
    }

    public int[] square2(){
        Homework5 cub = new Homework5();

        int[] list = cub.square2();
        for(int i=0; i<=list.length-1; i++){
            list[i] = list[i]*list[i];
        }
        for(int i = 0; i< list.length; i++){
            System.out.println(list[i]);
        }
        return list;
    }
}

