package javapart1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Activity1l3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        System.out.println("Nhap b:");
        int b = scanner.nextInt();
        System.out.println("a + b ="+ (a+b));
        System.out.println("a - b ="+ (a-b));
        System.out.println("a x b ="+ (a*b));
        System.out.println("a / b ="+ (a/b));
        System.out.println("a mod b ="+ (a%b));
    }
}
