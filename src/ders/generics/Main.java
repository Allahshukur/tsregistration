package ders.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        MyCar<BMW, Mercedes> myCar = new MyCar<>();

        List<String> list = new ArrayList<>();
        list.add("ddssd");

        System.out.println(list.get(0));

    }
}
