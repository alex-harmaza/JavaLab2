package com.epam.lab2;

import com.epam.lab2.task7.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Task7Test extends Assert {

    @Test
    public void checkSort(){
        Book[] books = new Book[]{
                new Book("1", "1", 1, "70-3-16-148410-0"),
                new Book("0", "0", 0, "678-3-16-148410-0"),
                new Book("3", "3", 3, "778-4-16-148410-3"),
                new Book("3", "3", 4, "779-3-15-148410-0"),
                new Book("2", "2", 2, "778-3-16-148411-0"),

                new Book("1", "1", 9, "878-3-16-148415-0"),
                new Book("0", "0", 8, "878-3-16-148414-0"),
                new Book("3", "3", 5, "878-3-16-148411-0"),
                new Book("3", "3", 7, "878-3-16-148413-0"),
                new Book("2", "2", 6, "878-3-16-148412-0")
        };

        Arrays.sort(books);

        for (int i = 0; i < books.length; i++){
            assertEquals("Error in position " + i, i, books[i].getPrice());
        }
    }
}
