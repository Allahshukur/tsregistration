package ders.collection;

import student.entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(11,"Allahshukur","Aghazade",29,"AAAAA");
        Student student1 = new Student(21,"Allahshukur1","Aghazade1",39,"AAAAA1");
        Student student2 = new Student(31,"Allahshukur2","Aghazade2",49,"AAAAA2");
        Student student3 = new Student(41,"Allahshukur3","Aghazade3",59,"AAAAA3");
        Student student4 = new Student(51,"Allahshukur4","Aghazade4",69,"AAAAA4");

        Set<Student> set = new TreeSet<>();
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

        System.out.println(set);


    }
}
