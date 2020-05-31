package javapart5;

import java.util.Scanner;

public class Apptest {
    public static void main (String [] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap tong so sach:");
        int n = scanner.nextInt();
        Book[] book = new Book[n];
        scanner.nextLine();
        for (int i = 0;i<n;i++){
            System.out.println("nhap ten sach" + (i+1));
            String name = scanner.nextLine();
            System.out.println("nhap ten tac gia:");
            String author = scanner.nextLine();
            System.out.println("nhap gia ban:");
            long price = scanner.nextLong();
            System.out.println("nhap tong so da ban dc:");
            long totalSold = scanner.nextLong();
            scanner.nextLine();
            book[i] = new Book(name,author,price,totalSold);
        }
        BookManagement bookManagement = new BookManagement(book);
        bookManagement.insach();
        bookManagement.tongsobestsell();
        bookManagement.sachbanchaynhat();
    }
}
