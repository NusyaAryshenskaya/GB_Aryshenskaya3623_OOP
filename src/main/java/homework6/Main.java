package main.java.homework6;
import main.java.homework6.Work3.Greeter;
import main.java.homework6.Work3.GreetingCasual;
import main.java.homework6.Work3.GreetingFormal;
import main.java.homework6.work1.Rectangle;
import main.java.homework6.work1.Square;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        // I.work1
        Square square = new Square();
        square.setSide(7);
        System.out.println("Сторона квадрата равна: " + square.getSide());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(9);
        rectangle.setWidth(5);
        System.out.println("Стороны прямоугольника равны: " + rectangle.getHeight() + " и " + rectangle.getWidth());

        // III.work3
        Greeter greeter = new Greeter(); ///варианты приветствия вынесла в отдельные классы?
        System.out.println(greeter.greet());
        greeter.setGreeting(new GreetingFormal()); // На печать выходит официальное и и формальное приветствие
        System.out.println(greeter.greet());

    }
}