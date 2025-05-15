package org.example;

import java.util.Scanner;

/**
 * This program estimates the value of Pi using the Monte Carlo method.
 */
public class Main {
    /**
     * The main method, in this time
     * calls the recursive formula function
     */
    public static void main(String[] args) {
        System.out.println("Please enter the number of points for estimating Pi:");
        Scanner sc = new Scanner(System.in);
        int totalPoints = sc.nextInt();
        int value = formula(totalPoints);

        double pi = 4 * (double) value / totalPoints;
        System.out.println("Estimated Pi: " + pi);
    }

    /**
     * Recursive method
     * @param totalPoints
     * @return
     */
    public static int formula(int totalPoints) {
        if (totalPoints == 0) {
            return 0;
        }
        double x = Math.random();
        double y = Math.random();
        if (x * x + y * y <= 1) {
            return 1 + formula(totalPoints - 1);
        }
        return formula(totalPoints - 1);
    }
}