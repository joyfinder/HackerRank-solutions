import java.io.*;
import java.util.*;


// Time complexity: O(n log n)
// Space complexity: O(n)

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int sz = scan.nextInt();
        double[] arr = new double[sz];
        double[] arr2 = new double[sz];
        
        // Saving numbers into first array
        for(int i = 0; i < sz; i++)
        {
            arr[i] = scan.nextDouble();
        }

        //Saving numbers into second array
        for(int i = 0; i < sz; i++)
        {
            arr2[i] = scan.nextDouble();
        }
        scan.close();

        System.out.format("%.3f", spearmanCor(arr, arr2));
    }

    // Calculating Spearman's rank correlation coefficient
    private static Double spearmanCor(double[] arr, double[] arr2)
    {
        // Checking errors
        if(arr == null || arr2 == null || arr.length != arr2.length)
        return null;

        int[] rankArr = getRanks(arr);
        int[] rankArr2 = getRanks(arr2);

        // Applying Spearman's formula
        int num = arr.length;
        double numerator = 0;
        for(int i =0 ; i < num; i++)
        {
            numerator += Math.pow((rankArr[i] - rankArr2[i]), 2);
        }
        numerator *= 6;
        return 1 - numerator / (num * ((num * num) - 1));
    }

    // getRanks method is to return a new array of ranks
    public static int[] getRanks(double[] newArray){
        int num = newArray.length;

        // Creaing pair array & sort by values
        Pair[] pair = new Pair[num];

        for(int i = 0; i < num; i++)
        {
            pair[i] = new Pair(i, newArray[i]);
        }
        Arrays.sort(pair, new PairValueComparator());

        // Create & return ranks[]
        int[] ranks = new int[num];
        int rank = 1;
        for(Pair p : pair){
            ranks[p.index] = rank++;
        }
        return ranks;
    }
}

/* A class to store 2 variables */
class Pair {
    public final int    index;
    public final double value;

    public Pair(int i, double v) {
        index = i;
        value = v;
    }
}

/* This lets us sort Pairs based on their value field */
class PairValueComparator implements Comparator<Pair> {
    double epsilon = 0.0001; // shouldn't use " == " to compare "doubles"
    @Override
    public int compare(Pair p1, Pair p2) {
        if (Math.abs(p1.value - p2.value) < epsilon) {
            return 0;
        } else if (p1.value < p2.value) {
            return -1;
        } else {
            return 1;
        }
    }
}
