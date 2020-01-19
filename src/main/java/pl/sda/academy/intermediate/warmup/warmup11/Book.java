package pl.sda.academy.intermediate.warmup.warmup11;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Book {

    String title;
    String author;
    int yearPushlished;
    int numberOfPages;
    double price;
    Genre type;

    public Book(String title, String author, int yearPushlished, int numberOfPages, double price, Genre type) {
        this.title = title;
        this.author = author;
        this.yearPushlished = yearPushlished;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPushlished() {
        return yearPushlished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public Genre getType() {
        return type;
    }
}
