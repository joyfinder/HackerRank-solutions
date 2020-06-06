import java.io.*;
import java.util.*;
import java.util.Scanner;

public class BotClean {
    
    private static int movements = Integer.MAX_VALUE;
    
    private static final char DIRTY = 'd';
    private static final char CLEAN = '-';
    private static final char visited = 'v';
    
    private static enum Move {
        RIGHT, LEFT, UP, DOWN, CLEAN
    }
    
    private static void next_move(int positionX, int positionY, String[] board)
    {
        char[][] cboard = new char[5][5];
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                cboard[i][j] = board[i].charAt(j);
            }
        }
        
        Move m = Move.CLEAN;
        
        if(cboard[positionX][positionY] == DIRTY)
        {
            System.out.println(m);
            return;
        }
        
        if(positionX != 0)
        {
            int c = move(positionX - 1, positionY, Move.UP, cboard, 1);
            
            if(movements > c)
            {
                movements = c;
                m = Move.UP;
            }
        }
        
        if(positionX != 4)
        {
            int c = move(positionX + 1, positionY, Move.DOWN, cboard, 1);
            
            if(movements > c)
            {
                movements = c;
                m = Move.DOWN;
            }
        }
        
        if(positionY != 0)
        {
            int c = move(positionX, positionY - 1, Move.LEFT, cboard, 1);
            
            if(movements > c)
            {
                movements = c;
                m = Move.LEFT;
            }
        }
        
        if(positionY != 4)
        {
            int c = move(positionX, positionY + 1, Move.RIGHT, cboard, 1);
            
            if(movements > c)
            {
                movements = c;
                m = Move.RIGHT;
            }
        }
        
        System.out.println(m);
    }
    
    private static int move(int x, int y, Move m, char[][] board, int count)
    {
        if(completed(board))
        {
            return count;
        }
        
        int newCount = count + 1;
        
        if(board[x][y] == DIRTY)
        {
            board[x][y] = visited;
            int c = move(x, y, Move.CLEAN, board, newCount);
            board[x][y] = DIRTY;
            
            return c;
        }
        
        int tmpCount = Integer.MAX_VALUE;
        board[x][y] = visited;

        if (x != 0 && board[x - 1][y] != visited) {
            tmpCount = Math.min(tmpCount,
                    move(x - 1, y, Move.UP, board, newCount));
        }
        
        if (x != 4 && board[x + 1][y] != visited) {
            tmpCount = Math.min(tmpCount,
                    move(x + 1, y, Move.DOWN, board, newCount));
        }

        if (y != 0 && board[x][y - 1] != visited) {
            tmpCount = Math.min(tmpCount,
                    move(x, y - 1, Move.LEFT, board, newCount));
        }
        
        if (y != 4 && board[x][y + 1] != visited) {
            tmpCount = Math.min(tmpCount,
                    move(x, y + 1, Move.RIGHT, board, newCount));
        }

        board[x][y] = CLEAN;

        return tmpCount;
    }
    
    private static boolean completed(char[][] board){
        
        for(char[] s : board)
        {
            for(char c : s) 
            {
                if(c == DIRTY)
                {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] position = new int[2];
        
        String[] board = new String[5];
        
        for(int i = 0; i < 2; i++)
        {
            position[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 5; i++)
        {
            board[i] = scan.next();
        }
        
        next_move(position[0], position[1], board);
        scan.close();
    }
}