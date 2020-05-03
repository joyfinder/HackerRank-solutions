import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void bubbleSort(int[] arr){

        int numSwaps = 0;

        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    numSwaps++;
                }
            }
            if(numSwaps == 0)
                break;
        }
        
        System.out.printf("Array is sorted in %d swaps.\n", numSwaps);
        System.out.printf("First Element: %d\n", arr[0]);
        System.out.printf("Last Element: %d\n", arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        bubbleSort(a);
    }
}

