package javapart4;

import java.util.Scanner;

public class ohhh {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tong so Svien: ");
        int n = scanner.nextInt();
        System.out.println();
        Students[] students = new Students[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("ten Sinh vien thu  "+ (i+1) );
            String name = scanner.nextLine();
            System.out.println("   Diem GPA thu " +(i+1));
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Students(name, gpa);
        }
        Studentman studentman = new Studentman(students);
        studentman.insoSVdo();
        studentman.insoSVtruot();
        studentman.svGPAmax();
        studentman.svGPAmin();

    }
}
