/*
 * Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле 
в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот",
чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).
 Мой владелец - <имя владельца>.".
 * 
 */
package lesson1.task1;

public class Owner {
    public String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
