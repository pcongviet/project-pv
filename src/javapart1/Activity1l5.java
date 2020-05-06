package javapart1;

import java.util.Scanner;

public class Activity1l5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        int a = n*10+n;
        int b = n*100+n*10+n;
        System.out.println("n+nn+nnn="+(n+a+b));

    }

}
