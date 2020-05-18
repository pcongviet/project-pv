package javapart3;

public class Xoaam {
    public static void main(String[] args){
        int[] a = {0, 0,1,2,0,8,9};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int k = i; k < n - 1; k++) {
                    a[k] = a[k + 1];
                }
                n = n - 1;
            }
        }
        System.out.print("Mang sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
