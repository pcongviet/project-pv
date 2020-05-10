package javapart2;

import java.util.Scanner;

public class Activity2l3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println("The sum of 1 to "+n+" is:"+sum);
        double average = ((double)sum)/n;
        System.out.println("The average is:" + average);

    }
}
