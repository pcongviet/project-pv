package javapart3;

public class Mang {
    public static void main(String[] args){
        int[] arrayNumber = new int [7];
        for(int i = 0; i<arrayNumber.length;i++) {
            arrayNumber[i] = 10;
        }
        for(int element:arrayNumber){
            System.out.println(element);
        }

    }
}
