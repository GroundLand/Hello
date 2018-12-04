package java8.stream;

import java8.Car;
import java8.Person;

import java.util.Optional;

public class OptionalTets {

    public static void main(String args[]) {
        Car car = new Car("blue", 100);

        Person person = new Person("mkyong", 30, car);
        String color = Optional.ofNullable(person).map(Person::getCar).map(Car::getColor).orElse("");
        System.out.println(color);
    }
}
