import java.util.Random;
import java.util.Scanner;

/**
 * This program calculates the number of pi using the MonteCarlo method.
 */
public class Main {
    /**
     * The main method
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        System.out.println("Enter the number for indicating the accuracy of number pi:");
        Scanner sc = new Scanner(System.in);

        double r = 1;
        double all = sc.nextDouble();
        double circle = 0;
        Random ran = new Random();

        for (int i = 0; i < all; i++) {
            double x = (ran.nextDouble() * (2 * r)) - r;
            double y = (ran.nextDouble() * (2 * r)) - r;
            if ((x * x + y * y) <= r * r) {
                circle++;
            }
        }

        double pi = 4 * (double) circle / all;
        System.out.println("The number of pi is " + pi);
    }
}

