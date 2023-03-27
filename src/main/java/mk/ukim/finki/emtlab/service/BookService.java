package mk.ukim.finki.emtlab.service;

import mk.ukim.finki.emtlab.model.Author;
import mk.ukim.finki.emtlab.model.Book;
import mk.ukim.finki.emtlab.model.Category;
import mk.ukim.finki.emtlab.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(String name, Category category, Long author, Integer availableCopies);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, String name, Category category, Long author, Integer availableCopies);

    Optional<Book> edit(Long id, BookDto bookDto);

    void deleteById(Long id);

}
