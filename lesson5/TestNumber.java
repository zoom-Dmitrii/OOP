package lesson5;

public class TestNumber {
    public Boolean testNumber(String txt) {
        // Модуль обработки корректного ввода данных
        try {
            Double.parseDouble(txt);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
