package mk.ukim.finki.emtlab.repository;

import mk.ukim.finki.emtlab.model.Book;
import mk.ukim.finki.emtlab.model.enumerations.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
