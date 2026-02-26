package student.entity;

public class Student implements Comparable<Student> {

    private int reqNumber;
    private String name;
    private String surname;
    private int age;
    private String  teacher;

    public Student() {
    }

    public Student(int reqNumber, String name, String surname, int age, String teacher) {
        this.reqNumber = reqNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.teacher = teacher;
    }

    public int getReqNumber() {
        return reqNumber;
    }

    public Student setReqNumber(int reqNumber) {
        this.reqNumber = reqNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getTeacher() {
        return teacher;
    }

    public Student setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    @Override
    public String toString() {
        return reqNumber + ". " + name + " " + surname + " " + age + " " + teacher;
    }

    @Override
    public int compareTo(Student o) {
        return this.reqNumber - o.reqNumber;
    }
}
