import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;

public class Solution {
    
    static void displayPathtoPrincess(int N, String[] grid)
    {
        int princessRow = 0;
        int princessCol = 0;
        int botRow = 0;
        int botCol = 0;
        
        // These 2 for loops determine where bot is situated in 3x3 grid maze
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(grid[i].charAt(j) == ('m'))
                {
                    botRow = i;
                    botCol = j;
                }
            }
        }
        
        // These 2 for loops determine where princess is situated in 3x3 grid maze
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(grid[i].charAt(j) == ('p'))
                {
                    princessRow = i;
                    princessCol = j;
                }
            }
        }
        
        // Calculating the distance between princess and bot in X, Y respectively
        int distanceX = princessCol - botCol;
        int distanceY = botRow - princessRow;
        
        // If distance X is greater than 0
        // It means princess is at the right hand side of bot
        // Therefore, bot moves left, otherwise vice versa
        
        if(distanceX > 0)
        {
            for(int i = 0; i < distanceX; i++)
                System.out.println("RIGHT");
        }
        else if(distanceX == 0)
        {
            
        }
        else
        {
           
            for(int i = 0; i < Math.abs(distanceX); i++)
            {
                System.out.println("LEFT");
            }
        }
        
        // If distance Y is greater than 0
        // It means princess is at the above side of bot
        // Therefore, bot moves UP, otherwise vice versa
        
        
        if(distanceY > 0)
        {
            for(int i = 0; i < distanceY; i++)
            {
                System.out.println("UP");
            }
        }
        else if(distanceY == 0)
        {
            
        }
        else
        {
            for(int i = 0; i < Math.abs(distanceY); i++)
            {
                System.out.println("DOWN");
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String grid[] = new String[num];
        
        for(int i = 0; i < num; i++)
        {
            grid[i] = scan.next();
        }
        
        displayPathtoPrincess(num, grid);
    }
}