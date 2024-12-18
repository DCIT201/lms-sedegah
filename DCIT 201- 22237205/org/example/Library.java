package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<org.example.Book> books;
    private List<org.example.Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(org.example.Book book) {
        books.add(book);
    }

    public void registerPatron(org.example.Patron patron) {
        patrons.add(patron);
    }

    public List<org.example.Book> getBooks() {
        return books;
    }

    public List<org.example.Patron> getPatrons() {
        return patrons;
    }

    public void lendBook(org.example.Book book, org.example.Patron patron) {
        if (books.contains(book) && !patron.getBorrowedBooks().contains(book)) {
            patron.borrowBook(book);
            books.remove(book);
        }
    }

    public void returnBook(org.example.Book book, org.example.Patron patron) {
        if (patron.getBorrowedBooks().contains(book)) {
            patron.returnBook(book);
            books.add(book);
        }
    }
}