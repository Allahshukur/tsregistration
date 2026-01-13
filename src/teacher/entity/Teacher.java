package teacher.entity;

public class Teacher {

    private int reqNumber;
    private String name;
    private String surname;
    private int age;

    public int getReqNumber() {
        return reqNumber;
    }

    public Teacher setReqNumber(int reqNumber) {
        this.reqNumber = reqNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Teacher setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Teacher setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return reqNumber + ". " + name + " " + surname + " " + age;
    }
}
