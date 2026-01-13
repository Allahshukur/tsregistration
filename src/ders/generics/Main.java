package ders.generics;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        MyCar<BMW> myCar = new MyCar<>(bmw);
        System.out.println("BMW = " + myCar.getCar());

        Mercedes mercedes = new Mercedes();
        MyCar<Mercedes> myCar1 = new MyCar<>(mercedes);
        System.out.println("Mercedes = " + myCar1.getCar());

    }
}
