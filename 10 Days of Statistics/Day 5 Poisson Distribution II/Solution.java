import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();

        double dailyCostA = 160 + 40 * (A + Math.pow(A, 2));
        double dailyCostB = 128 + 40 * (B + Math.pow(B, 2));

        System.out.printf("%.3f%n", dailyCostA);
        System.out.printf("%.3f%n", dailyCostB);
    }
}
