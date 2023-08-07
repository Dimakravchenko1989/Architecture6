package data;
/**
 * Created by Viktor Belous on 07.08.2023.
 */
import domain.Book;
import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> getAllBooks();
}