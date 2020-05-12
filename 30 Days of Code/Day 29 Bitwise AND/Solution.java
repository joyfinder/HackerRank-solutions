import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        
        for(int a = 0; a < t; a++)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int result = 0;

            for(int i = 1; i < n ; i++)
            {
                for(int j = i + 1; j <= n; j++)
                {
                    int maxPossibleValue = i & j;
                    if(maxPossibleValue > result && maxPossibleValue < k)
                    result = maxPossibleValue;
                }
            }
            System.out.println(result);
        }

    
    }
}
