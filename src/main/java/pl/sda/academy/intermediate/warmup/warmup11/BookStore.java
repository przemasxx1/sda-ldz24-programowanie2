package pl.sda.academy.intermediate.warmup.warmup11;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@ToString
@Getter
public class BookStore {

    List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public List<Book> listOfBooks() {


        books
                .stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(book -> System.out.println(book.toString()));

        return books;

    }
}
