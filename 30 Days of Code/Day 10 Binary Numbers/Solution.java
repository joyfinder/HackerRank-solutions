import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int remainder = 0;
        int consecutiveOne = 0;
        int num = 0;

        do{
            remainder = n % 2;
            n = n / 2;
            if(remainder == 1)
            {
                num++;
                if(num >= consecutiveOne)
                {
                    consecutiveOne = num;
                }
            }
            else
            {
                num = 0;
            }
            
        } while( n > 0);
        System.out.println(consecutiveOne);
        scanner.close();
    }
}
