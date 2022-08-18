package kg.megacom.models.dto;

import kg.megacom.models.Author;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class BookDto {
    Long id;
    String title;
    double price;
    List<Author> authors;

}
