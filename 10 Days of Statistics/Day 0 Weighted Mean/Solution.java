import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int totalVal = 0;
        int weightTotal = 0;
        int weight;
        float mean = 0;
        int[] arr = new int[num];
        int[] weightArr = new int[num];

        for(int i = 0; i < num; i++)
        {
            // inserting 5 times of number
             arr[i] = scan.nextInt();
        }

        for(int i = 0; i < num; i++)
        {
            // Inserting weight values
            weight = scan.nextInt();

            // Each arr index represents its own weights
            weightArr[i] = weight;

            // Then adding all weights together
            weightTotal += weightArr[i];

            // Calculating total values by multiplying both values and its own weights
            // totalVal should be 480
            totalVal += arr[i] * weightArr[i];
        }

        mean = (float) totalVal / weightTotal;
        System.out.printf("%.1f",mean);
    }
}
