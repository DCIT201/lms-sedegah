package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private List<org.example.Book> borrowedBooks;

    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(org.example.Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(org.example.Book book) {
        borrowedBooks.remove(book);
    }

    public List<org.example.Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}