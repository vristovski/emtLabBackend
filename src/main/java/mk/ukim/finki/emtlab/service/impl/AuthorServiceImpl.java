package mk.ukim.finki.emtlab.service.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emtlab.model.Author;
import mk.ukim.finki.emtlab.repository.AuthorRepository;
import mk.ukim.finki.emtlab.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> listAuthors() {
        return this.authorRepository.findAll();
    }
}