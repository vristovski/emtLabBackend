package mk.ukim.finki.emtlab.service.impl;

import mk.ukim.finki.emtlab.model.Country;
import mk.ukim.finki.emtlab.repository.CountryRepository;
import mk.ukim.finki.emtlab.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country create(String name, String continent) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException();
        }

        Country c = new Country(name, continent);
        countryRepository.save(c);
        return c;
    }

    @Override
    public Country update(String name, String continent) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException();
        }

        Country c = new Country(name, continent);
        countryRepository.save(c);
        return c;
    }

    @Override
    public void delete(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        countryRepository.deleteByName(name);
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
