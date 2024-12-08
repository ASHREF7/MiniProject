package com.sesame.miniprojet.Controller;


import com.sesame.miniprojet.Service.BookServiceImpl;
import com.sesame.miniprojet.entities.Book;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/BookC")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/allbook")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public @NonNull Optional<Book> getUserById(@PathVariable("id") Long id) {
        return bookService.getBookById(id);

    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        if (bookService.getBookById(id).isPresent()) {
            bookService.deleteBook(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
