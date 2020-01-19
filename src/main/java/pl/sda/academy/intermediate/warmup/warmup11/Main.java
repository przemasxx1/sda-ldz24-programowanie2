package pl.sda.academy.intermediate.warmup.warmup11;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

       List<Book> lista =  BookStoreInitializer.ListOfBooks();

        BookStore bookStore = new BookStore(lista);
        bookStore.listOfBooks();
    }
}
