package com.vivek.vivektransportt.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vivek.vivektransportt.Model.BookModelClass;
import com.vivek.vivektransportt.Repo.BookRepo;

@Service
public class BookingService implements BookingServiceInterface {

    BookRepo bookingTable;

    public BookingService(BookRepo br){

        this.bookingTable = br;

    }




    @Override
    public boolean savebooking(BookModelClass b) {

        try {

            bookingTable.save(b);
            return true;

            
        } catch (Exception e) {

            System.out.println(e);
            return false;
        }
       
       
    }

    @Override
    public List<BookModelClass> getAllData() {
      return bookingTable.findAll();
    }
    
}
