package org.example;

public class App {
    public static void main(String[] args) {
        org.example.Library library = new org.example.Library();


        org.example.Book book1 = new org.example.Book("1984", "George Orwell", 1949);
        org.example.Book book2 = new org.example.Book("To Kill a Mockingbird", "Harper Lee", 1960);
        org.example.Book book3 = new org.example.Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        org.example.Patron patron = new org.example.Patron("Alice");


        library.registerPatron(patron);


        library.lendBook(book1, patron);
        System.out.println(patron.getName() + " borrowed: " + patron.getBorrowedBooks().get(0).getTitle());


        library.returnBook(book1, patron);
        System.out.println(patron.getName() + " returned: " + book1.getTitle());


        System.out.println("Books available in the library:");
        for (org.example.Book book : library.getBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}