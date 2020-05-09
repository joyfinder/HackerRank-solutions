import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        // Using scanner library functions to store individual values
        int actualDay = scan.nextInt();
        int actualMonth = scan.nextInt();
        int actualYear = scan.nextInt();

        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();

        scan.close();

        int monthsDiff = actualMonth - expectedMonth;
        int daysDiff = actualDay - expectedDay;
        int yearDiff = actualYear - expectedYear;

        if(yearDiff > 0)
        {
            System.out.println(10000);
        }
        else
        {
            if(monthsDiff > 0 && yearDiff == 0)
            {
                System.out.println(monthsDiff * 500);
            }
            else
            {
                if(daysDiff > 0 && yearDiff == 0)
                {
                    System.out.println(daysDiff * 15);
                }
                else
                {
                    System.out.println(0);
                }
            }
        }
    }
}