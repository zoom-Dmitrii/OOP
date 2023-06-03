package lesson1;

public class task1 {

    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 5, "Dima");
        cat.greet();
        System.out.println();
        Cat cat2 = new Cat("Alisa", 2, "Olya");
        cat2.greet();
    }

}