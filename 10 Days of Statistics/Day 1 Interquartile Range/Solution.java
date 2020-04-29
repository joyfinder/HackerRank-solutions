import java.io.*;
import java.util.*;

public class Solution {

    private static double getMedian(ArrayList<Integer> list, int begin, int end){
        double median = 0;
        int sz = end - begin + 1;
        if(sz % 2 == 0)
            median = (list.get(begin + sz/2 - 1) + list.get(begin + sz/2)) / 2;
        else
        {
            median = list.get(begin + (sz - 1) / 2);
        }
        return median;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num; i++)
        {
            list.add(scan.nextInt());
        }

        for(int i = 0; i < num; i++)
        {
            int element = list.get(i);
            int freq = scan.nextInt();
            while(freq --> 1){
                list.add(element);
            }
        }
        scan.close();

        Collections.sort(list);

        double q1, q2, q3;
        num = list.size();
        q1 = getMedian(list, 0, num / 2 - 1);
        q2 = getMedian(list, 0, num - 1);

        if(num % 2 == 0){
            q3 = getMedian(list, num / 2 , num - 1);
        }
        else
        {
            q3 = getMedian(list, num / 2 + 1, num - 1);
        }

        System.out.println(q3 - q1);
    }
}
