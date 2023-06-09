package mk.ukim.finki.emtlab.web.rest;

import mk.ukim.finki.emtlab.model.enumerations.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://emtlabfrontend.herokuapp.com/")
@RequestMapping("/api/categories")
public class CategoryRestController {

    @GetMapping
    public List<Category> listCategories() {
        return Arrays.asList(Category.values());
    }
}