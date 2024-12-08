package com.sesame.miniprojet.Service;

import com.sesame.miniprojet.Repositories.IbookR;
import com.sesame.miniprojet.entities.Book;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl {
    @Autowired
    private IbookR bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public@NonNull Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
