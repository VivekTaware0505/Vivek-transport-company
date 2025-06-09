package com.vivek.vivektransportt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivek.vivektransportt.Model.BookModelClass;

@Repository
public interface BookRepo extends JpaRepository<BookModelClass, Long> {

    
    
}
