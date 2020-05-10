package javapart2;

import java.util.Scanner;

public class Activity2l4 {
    public static void  main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tang cua tam giac: ");
        int n = scanner.nextInt();
        for (int r = 1; r <= n; r++) {

            for (int a = n - r + 1; a >= 1; a--) {
                System.out.print(" ");
            }

            for (int b = 1; b <= r; b++) {
                System.out.print("*");
            }

            for (int c = r - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
