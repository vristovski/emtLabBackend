package mk.ukim.finki.emtlab.web.rest;

import mk.ukim.finki.emtlab.model.Country;
import mk.ukim.finki.emtlab.service.CountryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/countries")
public class CountryRestController {

    private final CountryService countryService;

    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    public List<Country> findAll() {
        return this.countryService.findAll();
    }
}
