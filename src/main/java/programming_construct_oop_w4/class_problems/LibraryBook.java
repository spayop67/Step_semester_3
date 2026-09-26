package programming_construct_oop_w4.class_problems;

import java.util.Scanner;

public class LibraryBook {
    String title;
    String isbn;
    boolean catalogued;
    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.catalogued = true;
    }
    public LibraryBook(String title) {
        this(title, "PENDING");
    }
    void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
    }

