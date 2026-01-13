package test;

public class BMW extends Car implements MyServiceInterface {


    @Override
    public void menu() {
        System.out.println(getName() + getSpeed());
    }

    @Override
    public void firstFillUp() {

    }

    @Override
    public void newFillUp() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }

    @Override
    public void findAll() {

    }
}
