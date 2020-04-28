import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++)
        {
            String str = scan.next();
            printEvensOdds(str);
        }
        scan.close();
    }

    public static void printEvensOdds(String str){
        StringBuffer evenStr = new StringBuffer();
        StringBuffer oddStr = new StringBuffer();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(i % 2 != 0)
            {
                oddStr.append(ch);
            }
            else
            {
                 evenStr.append(ch);
            }
        }
            // Avoid using printf otherwise stringbuffer may convert into int.
            System.out.println(evenStr + " " + oddStr);
    }
}
