import java.io.*;
import java.util.*;

public class Solution {

    public static double cumulative(double mean, double standardDeviation, double x){
        double para = (x - mean) / (standardDeviation * Math.sqrt(2));
        return (0.5) * (1 + errorFunction(para));
    }

    // The supporting material of explaining of how to apply error function
    /* The source could be found: http://introcs.cs.princeton.edu/java/21function/ErrorFunction.java.html */
    public static double errorFunction(double z){
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 + 
                                            t * ( 0.09678418 + 
                                            t * (-0.18628806 + 
                                            t * ( 0.27886807 + 
                                            t * (-1.13520398 + 
                                            t * ( 1.48851587 + 
                                            t * (-0.82215223 + 
                                            t * ( 0.17087277))))))))));
       
       if(0 <= z)
            return ans;
        else
            return -ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double mean = 70;
        double standardDeviation = 10;

        double result1 = 100 * (1 - cumulative(mean, standardDeviation, 80));
        double result2 = 100 * (1 - cumulative(mean, standardDeviation, 60));
        double result3 = 100 * cumulative(mean, standardDeviation, 60);
        System.out.format("%.2f%n", result1);
        System.out.format("%.2f%n", result2);
        System.out.format("%.2f%n", result3);
    }
    
}
