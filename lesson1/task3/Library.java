/* Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его
в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его
из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию
о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра
и выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
 * 
 */
package lesson1.task3;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    public void searchByAuthor(String author) {
        Boolean find = false;
        for (Book book : catalog) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                find = true;
                System.out.println(book);
            }
        }
        if (!find) {
        System.out.printf("Книг атора %s в библиотеке нет", author);
        }
    }

}
