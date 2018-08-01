package com.mycompany.myapp.repository.search;

import com.mycompany.myapp.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Spring Data Elasticsearch repository for the Book entity.
 */
public interface BookSearchRepository extends ElasticsearchRepository<Book, Long> {

//    @Query("select b from Book b where b.pricw <=20")
//    Page<Book> findCheapBooks(Pageable pageable);
}
