import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Предположим, что дан список Book {String title, List<Author> authors} , Author – класс {String fName, String lName} Необходимо сформировать map<Author, List<Book>>,  где ключ - автор, а значение список его книг. Естественно, если у книги несколько авторов, то книга должна отразиться в списке книг всех авторов данной книги.

 */
public class Main {
    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Чистый код. Создание, анализ и рефакторинг", List.of(new Author("Роберт", "Мартин"))),
                new Book("Чистая архитектура", List.of(new Author("Роберт", "Мартин"))),
                new Book("Java. Эффективное Программирование", List.of(new Author("Джошуа", "Блох"))),
                new Book("Приёмы объектно-ориентированного проектирования. Па́ттерны проектирования", List.of(
                        new Author("Эрих", "Гамма"),
                        new Author("Джон", "Влисидис"),
                        new Author("Ричард", "Хелм"),
                        new Author("Ральф", "Джонсон")
                ))
        );
        Map<Author, List<Book>> mapBooksToAuthors = createMapBooksToAuthors(books);
        System.out.println(mapBooksToAuthors);

    }
    public static Map<Author, List<Book>> createMapBooksToAuthors(List<Book> books){
        Map<Author, List<Book>> result = new HashMap<>();
        for(Book book: books){
            List<Author> authorsList = book.getAuthors();
            for (Author author: authorsList){
                List<Book> booksOfAuthor = result.computeIfAbsent(author, (b) -> new ArrayList<>());
                booksOfAuthor.add(book);
            }
        }
        return result;
    }

}