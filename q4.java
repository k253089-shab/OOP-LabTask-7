class Books{
    protected int bookID;
    protected String bookName;
    protected String bookAuthor;
    protected String ISBN;
    protected double price;

    Books(int bookID, String bookName, String bookAuthor, String ISBN, double price){
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.price = price;
    }
}


class Category1 extends Books{
    String category;

    Category1(int bookID, String bookName, String bookAuthor, String ISBN, double price, String category){
        super(bookID, bookName, bookAuthor, ISBN, price);
        this.category = category;
    }

    void display(){
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println();
    }
}


public class Main{
    public static void main(String[] args){

        Category1 b1 = new Category1(1, "Calculus", "Adam Mckay", "1111", 500, "Math");
        Category1 b2 = new Category1(2, "Programming Fundamentals", "Dennis Ritchie", "2222", 400, "Programming");
        Category1 b3 = new Category1(3, "Applied Physics", "Ben Dwarshius", "3333", 450, "Physics");

        Books book;

        book = b1;
        b1.display();

        book = b2;
        b2.display();

        book = b3;
        b3.display();
    }
}
