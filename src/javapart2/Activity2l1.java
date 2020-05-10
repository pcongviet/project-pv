package javapart2;

public class Activity2l1 {
    public static void main (String[] args) {
        System.out.println("Divided by 3:");
        for (int i=1;i<100;i++) {
            if (i % 3 == 0) System.out.println(i + ",");

        }
        System.out.println("Divided by 5:");
        for (int i =1;i<100;i++) {
            if (i%5==0) System.out.println(i+",");
        }
        System.out.println("Divided by 3 & 5:");
        for (int i = 1; i<100;i++) {
            if (i%3==0&&i%5==0) System.out.println(i+",");
        }

    }
}
