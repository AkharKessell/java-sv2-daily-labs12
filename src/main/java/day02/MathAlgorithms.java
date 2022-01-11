package day02;

import java.util.Scanner;

public class MathAlgorithms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        do {
            System.out.println("1. number (greater than 0):");
            String first = scanner.nextLine();
            firstNumber = Integer.parseInt(first);

            System.out.println("2. number (greater than 0):");
            String second = scanner.nextLine();
            secondNumber = Integer.parseInt(second);

        }while
        (firstNumber <= 0 || secondNumber <= 0);
        int left = firstNumber % secondNumber;
        while (left != 0){
            firstNumber = secondNumber;
            secondNumber = left;
            left = firstNumber % secondNumber;
        }

        System.out.println ("Greatest common divider for the two numbers: " + secondNumber);
    }
}
