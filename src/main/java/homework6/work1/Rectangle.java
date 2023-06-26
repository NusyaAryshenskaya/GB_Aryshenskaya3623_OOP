package main.java.homework6.work1;

import lombok.Getter; //использовала lombok для сеттера и геттера
import lombok.Setter;

// Прямоугольник
@Setter
@Getter
public class Rectangle {  //убрала перегрузку методов setWidth и SetHeight
    //int height;
    //int width;

    //public void setHeight(int height) {
        //this.height = height;
    //}

    //public void setWidth(int width) {
        //this.width = width;
    
    private int height; //создала приватные поля height и width
    private int width;
    
}
