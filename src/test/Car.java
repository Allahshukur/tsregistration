package test;

public class Car {

    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public void color(){
        System.out.println("This is Car Color Blue");
    }

    public void speed(){
        System.out.println("This is Car speed 1000km");
    }
}
