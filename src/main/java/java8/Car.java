package java8;

import lombok.Data;

@Data
public class Car {
    private String color;
    private double price;

    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }

   }
