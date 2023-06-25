package main.java.homework1;

public interface VendingMachine {

    void addDrink(HotDrink drink);

    Drink getProduct(String name, int volume, int temperature);
}