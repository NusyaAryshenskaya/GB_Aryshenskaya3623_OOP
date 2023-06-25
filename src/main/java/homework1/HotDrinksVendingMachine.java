package main.java.homework1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private final List<HotDrink> drinks;
    public HotDrinksVendingMachine() {
        drinks = new ArrayList<>();
    }

    @Override
    public void addDrink(HotDrink drink) {
        drinks.add(drink);
    }


    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (name.equals(drink.getNameDrink()) && volume == drink.getVolume() &&
                    temperature == drink.getTemperature()){
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name) {
        for (HotDrink drink : drinks) {
            if (name.equals(drink.getNameDrink())) {
                return drink;
            }
        }
        return null;
    }


    public HotDrink getProduct(int temperature) {
        for (HotDrink drink : drinks) {
            if (temperature == drink.getTemperature()) {
                return drink;
            }
        }
        return null;
    }

}