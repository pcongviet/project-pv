package javapart1;

import java.util.Scanner;

public class World {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao ten cua ban:");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi cua ban:");
        int age = scanner.nextInt();
        age= age + 10;
        System.out.println("ten vua nhap vao la: " + name + ", tuoi cua ban sau 10 nam:" + age);
    }


}