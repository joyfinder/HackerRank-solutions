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
        int num = scan.nextInt();

        if(num % 2 != 0)
        {
            System.out.println("Weird");
        }
        else if(2 <= num && num <= 5 && num % 2 == 0)
        {
            System.out.println("Not Weird");
        }
        else if(6 <= num && num <= 20 && num % 2 ==0)
        {
            System.out.println("Weird");
        }
        else if(num >= 20 && num % 2 == 0)
        {
            System.out.println("Not Weird");
        }
    }
}
