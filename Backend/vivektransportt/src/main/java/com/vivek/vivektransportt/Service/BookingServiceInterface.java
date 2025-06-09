package com.vivek.vivektransportt.Service;

import java.util.List;

import com.vivek.vivektransportt.Model.BookModelClass;

public interface BookingServiceInterface {

    public boolean savebooking(BookModelClass b);
    public List<BookModelClass> getAllData();


    
}
