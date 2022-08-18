package kg.megacom.mappers;

import kg.megacom.models.Reader;
import kg.megacom.models.dto.ReaderDto;


import java.util.List;

public interface ReaderMapper {

    Reader fromDto(ReaderDto readerDto);

    ReaderDto toDto(Reader reader);

    List<Reader> fromDtos(List<ReaderDto> readerDtos);

    List<ReaderDto> toDtos(List<Reader> readers);
}
