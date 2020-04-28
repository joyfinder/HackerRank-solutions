import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {

    private int mybookPrice;
    // Parameterized Constructor
    // Hence, there is no need to declare instance variables one more time.
    // *   @param title The book's title.
    // *   @param author The book's author.
    // *   @param price The book's price.
    MyBook(String title, String author, int price)
    {
        // Directly using super() method to retrieve higher class values
        super(title, author);
        this.mybookPrice = price;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor(){
        return this.author;
    }
    
    int getPrice(){
        return this.mybookPrice;
    }

    public void display(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}

public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}