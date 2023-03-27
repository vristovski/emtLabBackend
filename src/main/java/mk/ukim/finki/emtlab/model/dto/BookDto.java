package mk.ukim.finki.emtlab.model.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import mk.ukim.finki.emtlab.model.Author;
import mk.ukim.finki.emtlab.model.Category;

@Data
public class BookDto {

    private String name;
    private Category category;
    private Long author;
    private Integer availableCopies;

    public BookDto() {
    }

    public BookDto(String name, Category category, Long author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
