package hashtable;

import java.util.*;

class Book {
    String title;
    String isbn;  // Unique identifier for books

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // Books are considered equal if they have the same ISBN
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.isbn.equals(other.isbn);
    }

    // ❌ WRONG: hashCode() uses title instead of ISBN
    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return "\"" + title + "\" (" + isbn + ")";
    }


    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<Book>();

        Book b1 = new Book("Intro to Data Structures", "978-013484");
        Book b2 = new Book("Data Structures – 2nd Edition", "978-013484"); // same book, new title edition

        books.add(b1);
        books.add(b2);

        System.out.println("Books in set: " + books);
        System.out.println("Contains another copy? " +
            books.contains(new Book("Data Structures Revised", "978-013484")));
    }
}
