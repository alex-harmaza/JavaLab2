package com.epam.lab2.task7;


public class Book implements Cloneable, Comparable<Book>{

    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;


    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }


    public Book(String title, String author, int price, String isbn){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setIsbn(isbn);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null){
            throw new IllegalArgumentException("Title is null");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null){
            throw new IllegalArgumentException("Author is null");
        }
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0){
            throw new IllegalArgumentException("Negative price");
        }
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null){
            throw new IllegalArgumentException("Isbn is null");
        }
        this.isbn = isbn;
    }

    public int compareTo(Book o) {
        return isbn.compareTo(o.getIsbn());
    }


    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if (object.getClass() != this.getClass()){
            return false;
        }

        Book other = (Book) object;

        if (price != other.price){
            return false;
        }
        if (!title.equals(other.title)){
            return false;
        }
        if (!author.equals(other.author)){
            return false;
        }
        if (!isbn.equals(other.isbn)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return ((title.hashCode() * 17 + author.hashCode()) * 37 + price) * 52 + isbn.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        return book;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Book");
        builder.append("\n\ttitle: ").append(title);
        builder.append("\n\tauthor: ").append(author);
        builder.append("\n\tprice: ").append(price);
        builder.append("\n\tisbn: ").append(isbn);
        return builder.toString();
    }
}
