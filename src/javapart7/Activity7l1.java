package javapart7;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity7l1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so chuoi:");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i =0;i <n;i++){
            System.out.println("nhap chuoi thu"+(i+1)+":");
            String chuoi =scanner.nextLine();
            scanner.nextLine();
            list.add(chuoi);
        }
        System.out.println(list);
        System.out.println("nhap chuoi can them:");
        String a = scanner.nextLine();
        System.out.println("nhap vi tri muon them:");
        int b = scanner.nextInt();
        list.add(b-1,a);
        System.out.println(list);
    }
}
