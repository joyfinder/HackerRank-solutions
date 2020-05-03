import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double mean = 500;
        double standardDeviation = 80;
        int numSize = 100;
        double zScore = 1.96;

        double marginOfError = zScore * standardDeviation / Math.sqrt(numSize);

        System.out.format("%.2f%n", mean - marginOfError);
        System.out.format("%.2f%n", mean + marginOfError);
        
    }
}
