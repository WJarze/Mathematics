package bisection;

import java.util.Scanner;

/**
 *
 * @author Wojtek
 */
public class Bisection {

    public static double function(double x) {
        double f = x * x * x - x + 1;
        return f;
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("accuracy of calculations");
        double epsilon = In.nextDouble();
        System.out.println("enter the beginning of the range");
        double a = In.nextDouble();
        System.out.println("enter the and of the range");
        double b = In.nextDouble();
        double x0 = 0;
        int i = 0;
        while (Math.abs(a - b) > epsilon) {
            i++;
            x0 = (a + b) / 2;
            if (function(x0) == 0) {
                System.out.println("root of the equation " + x0);
                break;
            } else if (function(a) * function(x0) < 0) {
                b = x0;
            } else if (function(b) * function(x0) < 0) {
                a = x0;
            } else {
                System.out.println("The range does not meet the assumptions");
                break;
            }
        }
        System.out.println("approximate root of the equation " + x0);
        System.out.println("iterations " + i);
    }
}
