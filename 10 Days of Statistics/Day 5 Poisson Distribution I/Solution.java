import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double lambda = scan.nextDouble();
        int num = scan.nextInt();
        scan.close();

        System.out.println(poisson(num, lambda));
    }

    private static double poisson(int num, double lambda){
        return (Math.pow(lambda, num) * Math.pow(Math.E, -1 * lambda)) / fact(num);
    }

    private static Long fact(int num) {
        if(num < 0)
        return null;

        long ans = 1;
        while( num > 0){
            ans *= num--;
        }
        return ans;
    }
}
