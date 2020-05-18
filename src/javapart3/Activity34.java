package javapart3;

import sun.security.x509.InhibitAnyPolicyExtension;

import java.util.Scanner;

public class Activity34 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap");
        String a = scanner.nextLine();
        System.out.println(a);
        // cat chuoi
        String [] b = a.split(" ");
        String c = "";
        // so sanh tong cac ki tu cua cac chuoi cua b va cua c
        for (int i = 0; i < b.length;i++){
            if (b[i].length()>=c.length()){
                c = b[i];
            }
        }
        System.out.println("Chuoi dai nhat: " + c);
    }

}
