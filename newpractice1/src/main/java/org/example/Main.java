package org.example;

import java.util.Scanner;
/**
 *  * This program estimates the value of Pi using the Monte Carlo method.
 */
public class Main {
    /**
     * The main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Please enter the number for generating number of pi:");
        Scanner sc = new Scanner(System.in);
        double all = sc.nextDouble();
        double value = 0;

        for (int i = 0; i < all; i++) {
            double x = Math.random();
            double y = Math.random();

            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                value++;
            }
        }
            double pi = (4 * (value / all));
            System.out.println(pi);
        }
    }
