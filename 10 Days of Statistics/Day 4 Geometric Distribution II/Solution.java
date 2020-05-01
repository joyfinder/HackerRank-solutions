import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numerator = scan.nextInt();
        int denominator = scan.nextInt();
        int num = scan.nextInt();
        scan.close();

        double p = (double) numerator / denominator;

        double ans = 0;

        for(int i = 1; i <= 5; i++){
            ans += geometric(i, p);
        }
        System.out.printf("%.3f", ans);
    }

    private static double geometric(int n, double p){
        return Math.pow(1 - p, n - 1) * p;
    }

    private static Long combinations(int n, int x){
        if(x > n || x < 0 || n < 0)
            return null;

        return fact(n) / (fact(x) * fact( n - 1));
    }

    private static Long fact(int n){
        if( n < 0){
            return null;
        }
        long ans = 1;
        while(n > 0){
            ans *= n--;
        }

        return ans;
    }

}
