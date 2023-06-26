package main.java.homework2;

import main.java.homework2.actor.Human;
import main.java.homework2.market.Market;

public class Main {
    public static void main(String[] args) {


        Market market = new Market();

        market.update();

        Human human1 = new Human("Валерий Попов", 25, "Москва");
        Human human2 = new Human("Артем Козелков", 29, "Тольятти");
        Human human3 = new Human("Валентин Сидоров", 31, "Самара");
        Human human4 = new Human("Андрей Свиридоа", 38, "Волгоград");
        Human human5 = new Human("Дарья Терентьева", 31, "Санкт-Петербург");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human1);
        market.acceptToMarket(human5);

        market.update();

        human1.setMakeOrder();
        human2.setMakeOrder();
        human3.setMakeOrder();
        human4.setMakeOrder();

        market.update();

        human4.setTakeOrder();
        human1.setTakeOrder();

        market.update();

        market.update();

    }
}
