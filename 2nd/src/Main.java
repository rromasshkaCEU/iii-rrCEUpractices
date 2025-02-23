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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for indicating the accuracy of number pi:");
        int all = sc.nextInt();
        sc.close();
        Random ran = new Random();
        int circle = R(all, ran);
        double pi = 4 * circle / all;
        System.out.println("The number of pi is " + pi);
    }
    /**
     * The R method which is responsible for recursion.
     * @param n
     * @return
     */
    public static int R(int n,Random ran){
        if (n == 0){
            return 0;
        }
        double x = (ran.nextDouble() * (2 * 1)) - 1;
        double y = (ran.nextDouble() * (2 * 1)) - 1;

        return (x * x + y * y <= 1 ? 1 : 0) + R(n - 1, ran);
    }
}

