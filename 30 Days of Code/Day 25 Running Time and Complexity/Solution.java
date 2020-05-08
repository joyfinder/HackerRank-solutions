import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++)
        {
            // Inserting numbers into arrays
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++)
        {
            // To check whether values in array are prime
            // so using isPrime method to find out prime numbers
            // If value is prime, return true else false.
            if(isPrime(arr[i])){
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
        scan.close();
    }

    public static boolean isPrime(int num)
    {
        if(num == 2){
            return true;
        }
        
        // 1 & even numbers are not prime.
        if( num == 1 || num % 2 == 0)
        {
            return false;
        }

        for(int i = 3; i * i <= num;)
        {
            if(num % i == 0)
            {
                return false;
            }
            // In this case
            // There is no need to examine even numbers, because they are divisible by 2
            // so we only check odd numbers
            i += 2; 
        }
        return true;
    }
}
