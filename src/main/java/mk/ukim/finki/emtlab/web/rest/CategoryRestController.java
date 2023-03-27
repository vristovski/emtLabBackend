package mk.ukim.finki.emtlab.web.rest;

import mk.ukim.finki.emtlab.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/categories")
public class CategoryRestController {

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> categories() {
        return new ResponseEntity<List<Category>>(Arrays.asList(Category.values()), HttpStatus.OK);
    }
}
