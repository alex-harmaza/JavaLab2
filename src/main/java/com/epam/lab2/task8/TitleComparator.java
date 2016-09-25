package com.epam.lab2.task8;

import com.epam.lab2.task7.Book;

import java.util.Comparator;


public class TitleComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

}
