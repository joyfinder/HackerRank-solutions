import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String emailID = ".+@gmail\\.com$";
            Pattern p = Pattern.compile(emailID);
            List<String> list = new ArrayList();

            for(int i = 0; i < N; i++)
            {
                String name = scan.next();
                String email = scan.next();
                Matcher m = p.matcher(email);
                if(m.find())
                {
                    list.add(name);
                }
            }
            Collections.sort(list);
            for(String name : list)
                System.out.println(name);
    }
}
