package student.service;

import comman.Db;
import comman.MyService;
import student.entity.Student;
import teacher.entity.Teacher;

import java.util.Scanner;

public class StudentService extends MyService {

    public static MyService teacherService;

    @Override
    public void menu() { // Student starting point
        System.out.println(" 1. Student Create: \n " +
                "2. New Student Create: \n " +
                "3. Student Delete: \n " +
                "4. Student Update: \n " +
                "5. Student Search: \n " +
                "6. Student All");
        System.out.print("What surgery do you want to have? ");
        int number = new Scanner(System.in).nextInt();

        if (number == 1) { // Student Create
            firstFillUp();
        } else if (number == 2) { // New Student Create
            assert Db.students != null;
            newFillUp();
        } else if (number == 3) { // Student Delete
            delete();
        } else if (number == 4) { // Student Update
            assert Db.students != null;
            update();
        } else if (number == 5) { // Student Search
            assert Db.students != null;
            search();
        } else if (number == 6) { // Student All
            assert Db.students != null;
            findAll();
        }
    } // Students start

    @Override
    public void firstFillUp() {
        System.out.print("How many students will you include? ");
        int count = new Scanner(System.in).nextInt();
        Student[] students = new Student[count];

        for (int i = 0; i < students.length; i++) {
            students[i] = create(i);
        }
        Db.students = students;
    }

    @Override
    public void newFillUp() {
        Student[] oldStudents = Db.students;
        System.out.print("How many new students will you include? ");
        int count = new Scanner(System.in).nextInt();
        Student[] newStudents = new Student[oldStudents.length + count];
        for (int k = 0; k < oldStudents.length; k++) {
            newStudents[k] = oldStudents[k];
        }
        for (int i = oldStudents.length; i < newStudents.length; i++) {
            newStudents[i] = create(i);
        }
        oldStudents = newStudents;
        Db.students = oldStudents;
    }

    @Override
    public void delete() {
        Student[] students = Db.students;
        if (students == null) {
            System.out.println("____________________________________");
            System.out.println("      Silinecek Student yoxdur.");
            System.out.println("____________________________________");
        } else {
            System.out.print("Hansi Studenti silmek isteyirsiz? ");
            int delNumber = new Scanner(System.in).nextInt();
            students[delNumber - 1] = null;

            System.out.println("_____________________________________");
            System.out.println("      Student ugurla silindi.");
            System.out.println("_____________________________________");
        }
    }

    @Override
    public void update() {
        Student[] students = Db.students;
        System.out.println("Hansi Studenti yenilemek isteyirsiz? ");
        int updateNumber = new Scanner(System.in).nextInt();
        Student student = students[updateNumber - 1];
        System.out.println(student);
        System.out.println("Yenilemek isteyirsiz? \n Yes \n No");
        String yesNo = new Scanner(System.in).nextLine();
        if (yesNo.equalsIgnoreCase("Yes")) {
            System.out.print("Student Name: ");
            student.setName(new Scanner(System.in).nextLine());
            System.out.print("Student Surname: ");
            student.setSurname(new Scanner(System.in).nextLine());
            System.out.print("Student Age: ");
            student.setAge(new Scanner(System.in).nextInt());
        }
    }

    @Override
    public void search() {
        Student[] students = Db.students;
        System.out.print("Axtardiginiz Studentin adini ve ya soyadini daxil edin: ");
        String word = new Scanner(System.in).nextLine();
        System.out.println("___________________________________");
        for (int k = 0; k < students.length; k++) {
            if (students[k].getName().equalsIgnoreCase(word) || students[k].getSurname().equalsIgnoreCase(word)) {
                Student student = students[k];
                System.out.println(student);
            }
        }
        System.out.println("___________________________________");
    }

    @Override
    public void findAll() {
        Student[] students = Db.students;
        System.out.println("___________________________________");
        System.out.println("             Students");
        for (int k = 0; k < students.length; k++) {
            Student student = students[k];
            if (student == null) continue;
            System.out.println(student);
        }
        System.out.println("-----------------------------------");
    } // Student end

    private Student create(int reqNumber) {
        System.out.print("Please enter student name: ");
        String sName = new Scanner(System.in).nextLine();
        System.out.print("Please enter student surname: ");
        String sSurname = new Scanner(System.in).nextLine();
        System.out.print("Please enter student age: ");
        int sAge = new Scanner(System.in).nextInt();
        teacherService.findAll();
        System.out.print("Hansi Muellimin telebesidir? ");
        int teacherNumber = new Scanner(System.in).nextInt();
        Teacher[] teachers = Db.teachers;
        String teacherName = teachers[teacherNumber - 1].getName();

        Student student = new Student();
        student.setReqNumber(reqNumber + 1).setName(sName).setSurname(sSurname).setAge(sAge).setTeacher(teacherName);
        System.out.println("___________________________________");
        System.out.println(student);
        System.out.println("-----------------------------------");
        return student;
    }
}
