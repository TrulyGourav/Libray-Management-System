package com.gourav.library.management.Util;


import com.gourav.library.management.DataAccessLayer.Book;

public class BookValidator {

    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle()==null)
            return false;
        return true;
    }
}
