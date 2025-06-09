package com.vivek.vivektransportt.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookModelClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    long id;
     String fullname;
     String email;
     String date;
     String selectservice;
     String additionalnotes;

     public BookModelClass(){

     }

     public BookModelClass(long id, String fullname, String email, String date, String selectservice,
            String additionalnotes) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.date = date;
        this.selectservice = selectservice;
        this.additionalnotes = additionalnotes;
     }

     public long getId() {
         return id;
     }

     public void setId(long id) {
         this.id = id;
     }

     public String getFullname() {
         return fullname;
     }

     public void setFullname(String fullname) {
         this.fullname = fullname;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getDate() {
         return date;
     }

     public void setDate(String date) {
         this.date = date;
     }

     public String getSelectservice() {
         return selectservice;
     }

     public void setSelectservice(String selectservice) {
         this.selectservice = selectservice;
     }

     public String getAdditionalnotes() {
         return additionalnotes;
     }

     public void setAdditionalnotes(String additionalnotes) {
         this.additionalnotes = additionalnotes;
     }

     




    
}
