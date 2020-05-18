package javapart3;

import java.util.Scanner;

public class Activity3l2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu vao mang :");
        int n = scanner.nextInt();
        int [] a =new int [n];
        for (int i = 0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        //so sánh hai số hạng liền kề trong mảng
        for ( int i =0;i<a.length-1  ; i++ ) {
            if(a[i]!=a[i+1]){
                System.out.print(a[i]+ " ");
            }
        }
        //khi thoát khỏi for với Đk là false
        System.out.print(a[a.length-1]);


    }
}
