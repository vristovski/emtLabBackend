package mk.ukim.finki.emtlab.service;

import mk.ukim.finki.emtlab.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> findById(Long id);

    List<Author> findAll();

    Optional<Author> save(String name, String surname);

    void deleteById(Long id);
}
