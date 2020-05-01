import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double ratio = 1.09;

        double probability = ratio / (1 + ratio);
        int num = 6;

        // calculate the result of 6 children including 3 boys
        double ans = 0;
        for(int x = 3; x <= num; x++)
        {
            ans += binomial(x, num, probability);
        }
        System.out.format("%.3f", ans);
    }

    private static Double binomial(int x, int num, double probability){
    if(probability > 1 || probability < 0 || x < 0 || num < 0 || x > num){
        return null;
    }
    return comb(x, num) * Math.pow(probability, x) * Math.pow(1 - probability, num - x);
    }

    private static Long comb(int x, int num){
        if(x > num || x < 0 || num < 0){
            return null;
        }
        return factorial(num) / (factorial(x) * factorial(num - x));
    }

    private static Long factorial(int num){
        if(num < 0)
            return null;

            long ans = 1;
            while(num > 0){
                ans *= num--;
            }
            return ans;
    }
}
