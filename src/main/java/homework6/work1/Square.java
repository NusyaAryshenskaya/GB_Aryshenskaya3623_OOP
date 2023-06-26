package main.java.homework6.work1;

import lombok.Getter; //использовала lombok для сеттера и геттера
import lombok.Setter;

// Квадрат
@Setter
@Getter

//public class Square extends Rectangle {    // убрала перегрузку метода setWidth и SetHeight
    
    //public void setHeight(int height) {
        //this.height = height;
        //this.width = height;
    //}

    //@Override
    //public void setWidth(int width) {
        //this.width = width;
        //this.height = width;
    //}
//}

public class Square {    // создала приватное поле side
    private int side;
}