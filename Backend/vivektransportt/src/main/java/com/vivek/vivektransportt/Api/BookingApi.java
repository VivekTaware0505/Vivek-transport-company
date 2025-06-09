package com.vivek.vivektransportt.Api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.vivektransportt.Model.BookModelClass;
import com.vivek.vivektransportt.Service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BookingApi {

    BookingService bs;

    public BookingApi(BookingService bss){
        this.bs = bss;
    }



    @GetMapping("/booking")
    public List<BookModelClass> getMethodName() {
        return bs.getAllData();
    }


    @PostMapping("/book")
    public boolean postMethodName(@RequestBody BookModelClass entity) {
        
        return bs.savebooking(entity);
    }
    
    



    
    
}
