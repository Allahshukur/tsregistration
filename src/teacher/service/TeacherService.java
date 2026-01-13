package teacher.service;

import comman.Db;
import comman.MyService;
import teacher.entity.Teacher;
import java.util.Scanner;

public class TeacherService extends MyService {

    @Override
    public void menu() { // Teacher starting point
        System.out.println(" 1. Teacher Create: \n " +
                "2. New Teacher Create: \n " +
                "3. Teacher Delete: \n " +
                "4. Teacher Update: \n " +
                "5. Teacher Search: \n " +
                "6. Teacher All");
        System.out.print("What surgery do you want to have? ");
        int number = new Scanner(System.in).nextInt();

        if (number == 1) { // Teacher Create
            firstFillUp();
        } else if (number == 2) { // New Teacher Create
            assert Db.teachers != null;
            newFillUp();
        } else if (number == 3) { // Teacher Delete
            delete();
        } else if (number == 4) { // Teacher Update
            assert Db.teachers != null;
            update();
        } else if (number == 5) { // Teacher Search
            assert Db.teachers != null;
            search();
        } else if (number == 6) { // Teacher All
            assert Db.teachers != null;
            findAll();
        }
    } // Teacher start

    @Override
    public void firstFillUp() {
        System.out.print("How many teachers will you include? ");
        int count = new Scanner(System.in).nextInt();
        Teacher[] teachers = new Teacher[count];

        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = create(i);
        }
        Db.teachers = teachers;
    }

    @Override
    public void newFillUp() {
        Teacher[] oldTeachers = Db.teachers;
        System.out.print("How many new teachers will you include? ");
        int count = new Scanner(System.in).nextInt();
        Teacher[] newTeachers = new Teacher[oldTeachers.length + count];
        for (int k = 0; k < oldTeachers.length; k++) {
            newTeachers[k] = oldTeachers[k];
        }
        for (int i = oldTeachers.length; i < newTeachers.length; i++) {
            newTeachers[i] = create(i);
        }
        oldTeachers = newTeachers;
        Db.teachers =  oldTeachers;
    }

    @Override
    public void delete() {
        Teacher[] teachers = Db.teachers;
        if (teachers == null) {
            System.out.println("____________________________________");
            System.out.println("      Silinecek Teacher yoxdur.");
            System.out.println("____________________________________");
        } else {
            System.out.print("Hansi Muellimi silmek isteyirsiz? ");
            int delNumber = new Scanner(System.in).nextInt();
            teachers[delNumber - 1] = null;

            System.out.println("_____________________________________");
            System.out.println("      Teacher ugurla silindi.");
            System.out.println("_____________________________________");
        }
    }

    @Override
    public void update() {
        Teacher[] teachers = Db.teachers;
        System.out.println("Hansi Mellimi yenilemek isteyirsiz? ");
        int updateNumber = new Scanner(System.in).nextInt();
        Teacher teacher = teachers[updateNumber - 1];
        System.out.println(teacher);
        System.out.println("Yenilemek isteyirsiz? \n Yes \n No");
        String yesNo = new Scanner(System.in).nextLine();
        if (yesNo.equalsIgnoreCase("Yes")) {
            System.out.print("Teacher Name: ");
            teacher.setName(new Scanner(System.in).nextLine());
            System.out.print("Teacher Surname: ");
            teacher.setSurname(new Scanner(System.in).nextLine());
            System.out.print("Teacher Age: ");
            teacher.setAge(new Scanner(System.in).nextInt());
        }
    }

    @Override
    public void search() {
        Teacher[] teachers = Db.teachers;
        System.out.print("Axtardiginiz Muellimin adini ve ya soyadini daxil edin: ");
        String word = new Scanner(System.in).nextLine();
        System.out.println("___________________________________");
        for (int k = 0; k < teachers.length; k++) {
            Teacher teacher = teachers[k];
            if (teacher == null) continue;

            if (teacher.getName().equalsIgnoreCase(word) || teacher.getSurname().equalsIgnoreCase(word)) {
                System.out.println(teacher);
            }
        }
        System.out.println("___________________________________");
    }

    @Override
    public void findAll() {
        Teacher[] teachers = Db.teachers;
        System.out.println("***********************************");
        System.out.println("             Teachers");
        for (int k = 0; k < teachers.length; k++) {
            Teacher teacher = teachers[k];
            if (teacher == null) continue;
            System.out.println(teacher);
        }
        System.out.println("***********************************");
    } // Teacher end

    private Teacher create(int reqNumber) {
        System.out.print("Please enter teacher name: ");
        String tName = new Scanner(System.in).nextLine();
        System.out.print("Please enter teacher surname: ");
        String tSurname = new Scanner(System.in).nextLine();
        System.out.print("Please enter teacher age: ");
        int tAge = new Scanner(System.in).nextInt();

        Teacher teacher = new Teacher();
        teacher.setReqNumber(reqNumber + 1).setName(tName).setSurname(tSurname).setAge(tAge);
        return teacher;
    }
}
