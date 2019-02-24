package com.mspifarre.marc.lists.Entities;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

public class Book extends SugarRecord {

    @Unique
    String isbn;
    String title;
    String edition;

    public Book(){
    }

    public Book(String isbn, String title, String edition){
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
    }

    @Override
    public String toString(){
        return title;
    }
}
