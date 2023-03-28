package mk.ukim.finki.emtlab.service;

import mk.ukim.finki.emtlab.model.Country;

import java.util.List;

public interface CountryService {

    Country create(String name, String continent);

    Country update(String name, String continent);

    void delete(String name);

    List<Country> findAll();

}
