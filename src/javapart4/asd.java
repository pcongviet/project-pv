package javapart4;

import java.util.Scanner;

public class asd {
    public static void main(String[] args){
        Rectangle rectangle= new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        rectangle.setHeight(scanner.nextInt());
        System.out.println("nhap chieu rong");
        rectangle.setWidth(scanner.nextInt());
        int chuvi = rectangle.tinhChuVi();
        System.out.println("chu vi = "+chuvi);
        int dientich = rectangle.tinhDienTich();
        System.out.println("dien tich = "+dientich);
        rectangle.inwidth();
        rectangle.inheight();
        rectangle.ss();

    }




}
