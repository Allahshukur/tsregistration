package ders;

import java.util.Scanner;

public class Ulduzlari_rekursiya_ile_yazmaq {
    public static void main(String[] args) {
        /*
            *
           ***
          *****
         *******
         */

        System.out.print("Nece setrli * qurmag isteyirsen? = ");
        int n = new Scanner(System.in).nextInt();
        printPyramid(1, n);

    }

    // boşluqları rekursiya ilə çap edir
    static void printSpaces(int count) {
        if (count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    // ulduzları rekursiya ilə çap edir
    static void printStars(int count) {
        if (count == 0) return;
        System.out.print("*");
        printStars(count - 1);
    }

    // əsas rekursiv method
    static void printPyramid(int currentRow, int totalRows) {
        if (currentRow > totalRows) return;

        printSpaces(totalRows - currentRow);
        printStars(2 * currentRow - 1);
        System.out.println();

        printPyramid(currentRow + 1, totalRows);
    }
}
