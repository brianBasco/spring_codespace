package com.appdata.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String app() {
        return "Hello world";
    }

    /*
     * @PostMapping("/addBook")
    public Object createBook(@RequestBody Book book) {
        try {
            return repository.save(book);

        }catch (NullPointerException e) {
            return e.getMessage();
        }
    }
     
    

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        try{
            return (List<Book>) repository.findAll();
        }
        catch (NullPointerException e) {
            return null;
        }

    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable Long id) {
        try{
            return repository.findById(id).get();
        }
        catch (NullPointerException e) {
            return null;
        }
    }

    * 
     */

    /*
    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updateBook) {
        return repository.findById(id)
                .map(book -> {
                    book.setAuthor(updateBook.getAuthor());
                    book.setTitle(updateBook.getTitle());
                    return bookRepository.save(book);
                })
                .orElseGet(
                    () -> {
                        updateBook.setId(id);
                        return bookRepository.save(updateBook);
                    }
                );
    }
                */

    
}
