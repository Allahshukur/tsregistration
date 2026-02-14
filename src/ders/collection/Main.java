package ders.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> cars = new MyLinkedList<>();

        cars.add("BMW");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.addLast("Lexus");
        cars.addFirst("Mercedes");
        cars.add("sdsdsd");
        cars.add("dddsdsd");

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));
        System.out.println(cars.get(4));
        System.out.println(cars.get(5));
        System.out.println(cars.get(6));

    }
}
