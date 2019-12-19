package pl.dev.java.essentials.hackerrank.days30challenge.day13;

abstract class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
