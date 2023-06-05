/*
 * Класс Покупатель. Реализует методы интерфеса I_Customer
 */
package lesson2;

public class Сustomer implements I_Customer {
    private static int idCustomer;
    private String nameCustomer;

    public Сustomer() {
        idCustomer++;
        nameCustomer = String.format("Покупатель-%s", Integer.toString(idCustomer));
    }

    @Override
    public String toString() {
        return String.format("%s", nameCustomer);
    }

    @Override
    public void resetIdСustomer() {
        idCustomer = 0;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

}
