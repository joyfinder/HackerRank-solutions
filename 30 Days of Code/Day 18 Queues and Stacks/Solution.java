import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    Stack<Character> stack = new Stack<>();

    // Creating an instance of queue
    // LinkedList is an implementing class of Queue.
    Queue<Character> queue = new LinkedList<>();

    // Adding an object at top of the stack
    void pushCharacter(Character ch){
        stack.push(ch);
    }

    // Add object to the back of the line
    void enqueueCharacter(char ch){
        queue.add(ch);
    }

    // Removing the object at top of stack & return 
    char popCharacter(){
        return stack.pop();
    }

    char dequeueCharacter(){
        return queue.remove();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}