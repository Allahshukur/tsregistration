package ders.generics;

public class MyCar<A extends AbstractCar> {

    private final A car;

    public MyCar(A car) {
        this.car = car;
    }

    public A getCar(){
        return car;
    }
    
    public void drive(){
        car.drive();
    }
}
