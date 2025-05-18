
package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *  * This program estimates the value of Pi using the Monte Carlo method.
 */
public class Main {
    /**
     * The main method, in this time
     * using streams
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Please enter the number for generating number of pi:");
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        double formula = IntStream.range(0, all)
                .filter(i->{
            double x = Math.random();
            double y = Math.random();
            return (Math.pow(x, 2) + Math.pow(y, 2) <= 1);
            })
        .count();

        double pi = 4 * formula / all;
        System.out.println(pi);
    }
}
