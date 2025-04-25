package sample.project.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import sample.project.api.BooksApi;
import sample.project.dto.Book;

@RestController
public class BooksApiController implements BooksApi {

    @Override
    public ResponseEntity<Book> booksGet() {
        return ResponseEntity.ok(Book.builder().build());
    }
}
