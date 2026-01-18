package ders.generics;

public class MyCar<A, B> extends MyCar2<A, B> {

    private A car_1;
    private B car_2;

    public A getCar_1(){
        return car_1;
    }

    public B getCar_2(){
        return car_2;
    }
}
