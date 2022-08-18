package kg.megacom.mappers;

import kg.megacom.models.Author;
import kg.megacom.models.dto.AuthorDto;

import java.util.List;

public interface AuthorMapper {

    Author fromDto (AuthorDto authorDto);
    AuthorDto toDto (Author author);

    List<Author> fromDtos(List<AuthorDto> authorDtos);
    List<AuthorDto> toDtos(List<Author> authors);
}
