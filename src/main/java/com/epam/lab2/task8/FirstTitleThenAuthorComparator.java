package com.epam.lab2.task8;

import com.epam.lab2.task7.Book;

import java.util.Comparator;


public class FirstTitleThenAuthorComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0){
            result = o1.getAuthor().compareTo(o2.getAuthor());
        }
        return result;
    }

}
