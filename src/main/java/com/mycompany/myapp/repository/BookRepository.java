package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;

import java.util.List;


/**
 * Spring Data JPA repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("select b from Book b where b.pricw <=20")
   Page<Book> findCheapBooks(Pageable pageable);



}
