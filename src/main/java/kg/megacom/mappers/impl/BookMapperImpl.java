package kg.megacom.mappers.impl;

import kg.megacom.mappers.BookMapper;
import kg.megacom.models.Book;
import kg.megacom.models.dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class BookMapperImpl implements BookMapper {
    @Override
    public Book fromDto(BookDto bookDto) {
        Book book = new Book();
        book.setId(book.getId());
        book.setPrice(book.getPrice());
        book.setTitle(book.getTitle());
        return book;
    }

    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(bookDto.getId());
        bookDto.setPrice(bookDto.getId());
        bookDto.setTitle(bookDto.getTitle());
        return bookDto;
    }

    @Override
    public List<Book> fromDtos(List<BookDto> bookDtos) {
        List<Book> books = new ArrayList<>();

        for (BookDto item: bookDtos) {
            Book book = fromDto(item);
            books.add(book);
        }
        return books;
    }

    @Override
    public List<BookDto> toDtos(List<Book> books) {
        List<BookDto> bookDtos = new ArrayList<>();

        for (Book item: books) {
            BookDto bookDto = toDto(item);
            bookDtos.add(bookDto);
        }
        return bookDtos;
    }
}
