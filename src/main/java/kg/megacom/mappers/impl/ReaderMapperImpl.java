package kg.megacom.mappers.impl;

import kg.megacom.mappers.ReaderMapper;
import kg.megacom.models.Reader;
import kg.megacom.models.dto.ReaderDto;

import java.util.ArrayList;
import java.util.List;

public class ReaderMapperImpl implements ReaderMapper {
    @Override
    public Reader fromDto(ReaderDto readerDto) {
        Reader reader = new Reader();
        reader.setId(reader.getId());
        reader.setName(reader.getName());
        reader.setSurname(reader.getSurname());
        reader.setPatronymic(reader.getPatronymic());
        reader.setTicketNum(reader.getTicketNum());
        reader.setAddress(reader.getAddress());
        reader.setBirthDate(reader.getBirthDate());
        return reader;
    }

    @Override
    public ReaderDto toDto(Reader reader) {
        ReaderDto readerDto = new ReaderDto();
        readerDto.setId(readerDto.getId());
        readerDto.setName(readerDto.getName());
        readerDto.setSurname(readerDto.getSurname());
        readerDto.setPatronymic(readerDto.getPatronymic());
        readerDto.setTicketNum(readerDto.getTicketNum());
        readerDto.setAddress(readerDto.getAddress());
        readerDto.setBirthDate(readerDto.getBirthDate());
        return readerDto;
    }

    @Override
    public List<Reader> fromDtos(List<ReaderDto> readerDtos) {
        List<Reader> readers = new ArrayList<>();

        for (ReaderDto item: readerDtos) {
            Reader reader = fromDto(item);
            readers.add(reader);
        }
        return readers;
    }

    @Override
    public List<ReaderDto> toDtos(List<Reader> readers) {
        List<ReaderDto> readerDtos = new ArrayList<>();

        for (Reader item: readers) {
            ReaderDto readerDto = toDto(item);
            readerDtos.add(readerDto);
        }
        return readerDtos;
    }
}
