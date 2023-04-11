package mk.ukim.finki.emtlab.service;

import mk.ukim.finki.emtlab.model.Book;
import mk.ukim.finki.emtlab.model.dto.BookDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
public interface BookService {

    List<Book> listBooks();

    Page<Book> listBooksPaginated(Pageable pageable);

    Optional<Book> findById(Long id);

    Optional<Book> create(BookDto bookDto);

    Optional<Book> update(Long id, BookDto bookDto);

    void deleteById(Long id);

    Optional<Book> take(Long id);
}