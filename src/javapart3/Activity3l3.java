package javapart3;

import java.util.Scanner;
public class Activity3l3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n vao mang 1:");
        int n = scanner.nextInt();
        int [] array =new int [n];
        for (int i = 0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        //tinh trung binh cong cac so le o vi tri chan
        int a = 0;
        int b = 0;
        for (int i = 0; i < n;i++){
            if (i%2==0&&array[i]%2!=0)
                a = a + array[i];
            b++;
        }
        double c = (((double) a) / b);
        System.out.println("trung binh cong cac so le o vi tri chan:"+c);
        //tim so lon nhat trong mang
        int d = array[0];
        for (int i = 0; i <n-1; i++){
            if (d<array[i+1])
                d=array[i+1];
        }
        System.out.println("so lon nhat trong mang:"+d);
        //vi tri so nho nhat trong mang
        int x =0;
        int y =0;
        for ( int i = 0; i<n-1;i++){
            if (y>array[i+1]){
                y=array[i+1];
                x = i;
            }
        }
        System.out.println("vi tri so nho nhat trong mang"+x);
        //thay the cac phan tu am thanh 0
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.print("Mang sau khi thay the cac phan tu thanh 0: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        //mang giam dam
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int p = array[i];
                    array[i] = array[j];
                    array[j] = p;
                }
            }
        }
        System.out.print("Mang giam dan: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
