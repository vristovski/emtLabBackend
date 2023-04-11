package mk.ukim.finki.emtlab.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emtlab.model.enumerations.Category;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private String name;

    private Category category;

    private Long author;

    private Integer availableCopies;
}