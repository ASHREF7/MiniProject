package com.sesame.miniprojet.Repositories;

import com.sesame.miniprojet.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IbookR extends JpaRepository<Book,Long> {
        Optional<Book> findById(Long id);
}

