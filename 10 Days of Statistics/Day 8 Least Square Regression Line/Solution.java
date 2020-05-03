import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] arr = {95, 85, 80, 70, 60};
        int[] arr2 = {85, 95, 70, 65, 70};
        double studentScore = 80;

        // Get Coefficient for Least Square Regression Line
        double b = pearson(arr, arr2) * (standardDeviation(arr2) / standardDeviation(arr));
        double a = getMean(arr2) - b * getMean(arr);

        // Calculating & print predicted score
        double result = a + b * studentScore;
        System.out.format("%.3f", result);
    }

    // Calculating Pearson coefficient
    private static Double pearson(int[] arr, int[] arr2)
    {
        if(arr.length != arr2.length || arr == null || arr2 == null)
            return null;

            double arrMean = getMean(arr);
            double arr2Mean = getMean(arr2);

            int num = arr.length;
            double numerator = 0;

            for(int i = 0; i < num; i++)
            {
                numerator += (arr[i] - arrMean) * (arr2[i] - arr2Mean);
            }
            return numerator / (num * standardDeviation(arr) * standardDeviation(arr2));
    }

    private static Double getMean(int[] newArray)
    {
        if(newArray == null){
            return null;
        }

        int total = 0;
        for(int num : newArray){
            total += num;
        }
        return (double) total / newArray.length;
    }

    private static Double standardDeviation(int[] arr)
    {
        if(arr == null)
            return null;

            double mean = getMean(arr);
            int sum = 0;
            for(double x : arr)
            {
                sum += Math.pow(x - mean, 2);
            }
            double variance = sum / arr.length;
            return Math.sqrt(variance);
    }
}
