package main.java.homework1;

//1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
//    метод getProduct (int name, int volume, int temperature) выдающий продукт соответствующий имени, объёму
//    и температуре.
//3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат, и воспроизвести логику
//    заложенную в программе.
//4. Всё вышеуказанное создать согласно принципам ООП пройденным на семинаре.

public class Main {

    public static void main(String[] args) {

        HotDrink tea = new HotDrink("Чай", 200, 90);
        HotDrink coffee = new HotDrink("Кофе", 300, 80);
        HotDrink cocoa = new HotDrink("Какао", 250, 75);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();

        vendingMachine.addDrink(tea);
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(cocoa);

        System.out.println(vendingMachine.getProduct("Чай"));
        System.out.println(vendingMachine.getProduct("Кофе"));
        System.out.println(vendingMachine.getProduct("Какао"));
        System.out.println(vendingMachine.getProduct(80));

    }
}