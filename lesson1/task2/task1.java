package lesson1.task2;

public class task1 {
    
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(25, 35);

        System.out.printf("Площадь прямоугольника №1 = %d \n", rectangle1.calculateArea());
        System.out.printf("Периметр прямоугольника №1 = %d \n", rectangle1.calculatePerimeter());
        
        System.out.printf("Площадь прямоугольника №2 = %d \n", rectangle2.calculateArea());
        System.out.printf("Периметр прямоугольника №2 = %d \n", rectangle2.calculatePerimeter());
    }
}
