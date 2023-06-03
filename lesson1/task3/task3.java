package lesson1.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");

        Library library = new Library();
        library.addBook(new Book("Красная шапочка", "Братья Гримм"));
        library.addBook(new Book("Приключения Чиполлино", "Джанни Родари"));
        library.addBook(new Book("Городок в табакерке", "Владимир Одоевский"));
        library.addBook(new Book("Коняга", "Салтыков-Щедрин"));
        library.addBook(new Book("Подарки феи", "Шарль Перро"));
        library.addBook(new Book("Подарки феи 2", "test good"));
        library.addBook(new Book("Самоотверженный заяц", "Салтыков-Щедрин"));

        System.out.println();
        library.displayAvailableBooks();

        System.out.println();

        System.out.print("Поиск книги. Автор: ");
        library.searchByAuthor(scanner.nextLine());
    }
}
