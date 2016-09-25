package com.epam.lab2.task8;

import com.epam.lab2.task7.Book;

import java.util.Comparator;


public class AuthorTitlePriceComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        result += o1.getTitle().compareTo(o2.getTitle());
        result += o1.getPrice() - o2.getPrice();
        return result;
    }

}
