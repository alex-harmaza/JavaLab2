package com.epam.lab2;

import com.epam.lab2.task7.Book;
import com.epam.lab2.task8.AuthorTitlePriceComparator;
import com.epam.lab2.task8.FirstAuthorThenTitleComparator;
import com.epam.lab2.task8.FirstTitleThenAuthorComparator;
import com.epam.lab2.task8.TitleComparator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Task8Test extends Assert {

    @Test
    public void checkTitleComparator(){
        Book[] books = new Book[]{
                new Book("B", "", 1, "1"),
                new Book("E", "", 4, "2"),
                new Book("D", "", 3, "2"),
                new Book("A", "author", 0, "0"),
                new Book("C", "", 2, "3")
        };

        Arrays.sort(books, new TitleComparator());

        for (int i = 0; i < books.length; i++){
            assertEquals("Error in position " + i, i, books[i].getPrice());
        }
    }

    @Test
    public void checkAuthorTitlePriceComparator(){
        Book[] books = new Book[]{
                new Book("C", "A", 5, "4"),
                new Book("A", "B", 5, "3"),
                new Book("A", "B", 4, "2"),
                new Book("A", "A", 2, "1"),
                new Book("A", "", 2, "0")
        };

        Arrays.sort(books, new AuthorTitlePriceComparator());

        for (int i = 0; i < books.length; i++){
            assertEquals("Error in position " + i, Integer.toString(i), books[i].getIsbn());
        }
    }

    @Test
    public void checkFirstTitleThenAuthorComparator(){
        Book[] books = new Book[]{
                new Book("C", "A", 4, "4"),
                new Book("B", "B", 3, "3"),
                new Book("B", "A", 2, "2"),
                new Book("A", "B", 1, "1"),
                new Book("A", "A", 0, "0")
        };

        Arrays.sort(books, new FirstTitleThenAuthorComparator());

        for (int i = 0; i < books.length; i++){
            assertEquals("Error in position " + i, i, books[i].getPrice());
        }
    }

    @Test
    public void checkFirstAuthorThenTitleComparator(){
        Book[] books = new Book[]{
                new Book("A", "D", 4, "4"),
                new Book("A", "C", 2, "3"),
                new Book("D", "C", 3, "2"),
                new Book("A", "A", 0, "1"),
                new Book("B", "A", 1, "0")
        };

        Arrays.sort(books, new FirstAuthorThenTitleComparator());

        for (int i = 0; i < books.length; i++){
            assertEquals("Error in position " + i, i, books[i].getPrice());
        }
    }
}
