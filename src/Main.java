import comman.MyService;
import student.service.StudentService;
import teacher.service.TeacherService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final MyService teacherService = new TeacherService();
    private static final MyService studentService = new StudentService();

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("Please enter i = ");
                int i = new Scanner(System.in).nextInt();
                System.out.println(i);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


//        while (true) {
//            System.out.println("      1. TEACHER");
//            System.out.println("      2. STUDENT");
//
//            System.out.print("Secim edin: ");
//            int teacherAndStudent = new Scanner(System.in).nextInt();
//
//            if (teacherAndStudent == 1) {
//                teacherService.menu();
//            } else if (teacherAndStudent == 2) {
//                StudentService.teacherService = teacherService;
//                studentService.menu();
//            } else {
//                System.out.println("________________________________________");
//                System.out.println("               Secim edin:              ");
//                System.out.println("________________________________________");
//            }
//        }
    }

}