package lesson2;

import java.util.Random;
import java.util.Scanner;

public class task2_1 {

    private static void printMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("Введите номер меню:");
        System.out.println("1 - Пришел новый покупатель");
        System.out.println("2 - Покупатель совершил покупку");
        System.out.println("3 - Покупатель передумал");
        System.out.println("4 - Показать очередь");
        System.out.println("5 - Отчет продаж");
        System.out.println("0 - Для завершения работы приложения");
        System.out.println("-------------------------------------------------");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Магазин. Очередь");
        Scanner scanner = new Scanner(System.in);
        MyQueue myQueue = new MyQueue(); // Магазин открылся, касса готова под очередь
        Statistic statistic = new Statistic(); // Создали новый экземпляр класса для статистики
        System.out.println("Выберите действие:");
        Random random = new Random();

        printMenu(); // Вызов меню выбора действий
        String userInput = scanner.nextLine(); // userInput сохраняет пользовательский ввод
        while (!userInput.equals("0")) { // Пока ввод не содержит 0 - ноль
            if (userInput.equals("1")) { // Ввели 1 Пришел новый покупатель
                myQueue.addInQueue(new Сustomer()); // Создали и добавили покупателя в очередь
                System.out.printf("%s встал в очередь",
                        myQueue.getLast());
                System.out.println();
            } else if (userInput.equals("2")) { // Ввели 2. Покупатель совершил покупку и ушел
                if (myQueue.getFirst() != null) {
                    System.out.printf("%s совершил покупку и покинул очередь",
                            myQueue.getFirst());
                    System.out.println();
                    myQueue.setFirstExpense((double) random.nextInt(30_000) / 3);// случайная трата
                    statistic.setLogs(myQueue.getOneQueue());
                    myQueue.delOutQueue();
                } else {
                    System.out.println("Нет очереди");
                    System.out.println();
                }
            } else if (userInput.equals("3")) { // Ввели 3. Покупатель передумал, случайный ушел из очереди
                if (myQueue.getFirst() != null) {
                    myQueue.mouveQueue();
                } else {
                    System.out.println("Нет очереди");
                    System.out.println();
                }
            } else if (userInput.equals("4")) { // Ввели 4. Показать очередь
                System.out.printf("Вся очередь: %s ",
                        myQueue.getAllQueue());
                System.out.println();
            } else if (userInput.equals("5")) { // Ввели 5. Показать отчет по покупателям
                System.out.printf("Совершенные покупки ");
                Calculate func_1 = (m) -> {
                    int count = 0;  // модет пригодиться в дальнейшем
                    Double x = 0.0;
                    for (Сustomer cСustomer : statistic.getLogsRecord()) {
                        count++;
                        x += cСustomer.getExpenses();
                    }
                    return x;
                };
                System.out.printf("Количество покупателей %s\n", statistic.getSize());
                System.out.printf("Куплено товара на сумму %.2f\n", func_1.I_Calculate(statistic));
                System.out.println();
            } else // Если ввели значения пункта меню не из предложенных, вывод ошибки и заново
                System.out.println("Такого пункта меню нет, сделайте выбор из трех пунктов:");
            printMenu();
            userInput = scanner.nextLine();
        }
        System.out.println("Программа завершена");
    }
}