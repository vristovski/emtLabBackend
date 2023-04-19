package mk.ukim.finki.emtlab.web.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emtlab.model.Author;
import mk.ukim.finki.emtlab.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://emtlabfrontend.herokuapp.com/")
@RequestMapping("/api/authors")
@AllArgsConstructor
public class AuthorRestController {

    private final AuthorService authorService;

    @GetMapping
    public List<Author> listAuthors(){
        return this.authorService.listAuthors();
    }
}