package pl.sda.academy.intermediate.warmup.warmup11;

import java.io.*;
import java.util.*;

public class BookStoreInitializer {

    public static List<Book> ListOfBooks() throws IOException {

        List<Book> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"));


        while (bufferedReader.readLine() != null) {
            String[] pierwszaLinia = bufferedReader.readLine().split("\\|");

            Book book = new Book(pierwszaLinia[0], pierwszaLinia[1], Integer.parseInt(pierwszaLinia[2]), Integer.parseInt(pierwszaLinia[3]), Double.parseDouble(pierwszaLinia[4]), Genre.valueOf(pierwszaLinia[5]));
            list.add(book);
            //  System.out.println(bufferedReader.readLine());

        }

      //  System.out.println(list);

        return list;
    }
}
