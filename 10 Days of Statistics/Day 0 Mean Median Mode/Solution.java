import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numOfInteger = scan.nextInt();
        int[] arr = new int[numOfInteger];

        Map<Integer, Integer> map = new HashMap<>();

        int total = 0;
        double mediantotal = 0;
        double mean = 0;

        // First inputing numbers into array
        // This loop is used as calculating mean
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
            total += arr[i];
            mean = (double) total / arr.length;
        }
        System.out.println(mean);

        // counting frequency of each number
        Arrays.sort(arr);
        if(arr.length % 2 == 0)
        {   
            // here comes ArrayIndexOutOfBounds
            mediantotal = (double)(arr[arr.length/2 - 1] + arr[arr.length/2]) / 2;
        }
        else
        {
            mediantotal = (double)arr[(arr.length - 1)/2];
        }
        System.out.println(mediantotal);

        // Traverse through array elements &
        // count frequency
        Arrays.sort(arr);
        int temp = arr[0];
        int max = 0;
        int occur = 0;
        int mode = 0;

        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] == temp){
                occur++;
            }
            else
            {
                occur = 1;
                temp = arr[i];
            }

            if(occur > max){
                max = occur;
                mode = arr[i];
            }
        }
        System.out.println(mode);

    }
}
