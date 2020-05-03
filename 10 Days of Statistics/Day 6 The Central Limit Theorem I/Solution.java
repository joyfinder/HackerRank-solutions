import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double elevatorLiftingWeights = 9800;
        double boxes = 49;
        double mean = 205;
        double standardDeviation = 15;

        // Formulas given in tutorials
        double sampleMean = boxes * mean;
        double sampleStandardDeviation = Math.sqrt(boxes) * standardDeviation;
        System.out.format("%.4f", cumulative(sampleStandardDeviation, sampleMean, elevatorLiftingWeights));
    }

    // Calculating cumulative possibility
    public static double cumulative(double standardDeviation, double sampleMean, double x){
        double para = (x - sampleMean) / (standardDeviation * Math.sqrt(2));
        return (0.5) * (1 + errorFunction(para));
    }

    public static double errorFunction(double z){
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // using Horner's method
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
        if (z >= 0) return  ans;
        else        return -ans;
    }
}
