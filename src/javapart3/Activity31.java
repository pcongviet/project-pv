package javapart3;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n vao mang 1:");
        int n = scanner.nextInt();
        int [] array1 =new int [n];
        for (int i = 0;i<n;i++){
            array1[i]=scanner.nextInt();
        }
        System.out.println("nhap m vao mang 2");
        int m = scanner.nextInt();
        int [] array2 = new int [m];

        for (int i = 0;i<n;i++) {
            array2[i] = scanner.nextInt();
        }
        int e = array1.length+array2.length;
        int [] array3 = new int [e];
        for (int i = 0; i<e;i++){
            if (i<n)
                array3[i]= array1[i];
            else
                array3[i]=array2[i-n];

        }
        for (int i = 0;i<e;i++){
            for (int j=i +1;j<e-1;j++)
                if (array3[i]>array3[j]){
                    int a = array3[i];
                    array3[i]=array3[j];
                    array3[j]=a;
                }


        }
        for (int i =0; i<e;i++){
            System.out.print(array3[i]);
        }

    }
}
