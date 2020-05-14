package javapart3;

public class Activity3l2 {
    public static void main(String[] args) {
        int [] a = {20,20,30,40,50,50,50};
        int [] b = new int[a.length] ;
        for ( int i =0; i < a.length; i++ ) {
            int c= 0;
            for (int j=0; j < a.length; j++) {
                if (a[i] != a[j]) {
                    a[c] = a[i];
                    c++;
                }
            }
        }
        for(int element:b){
            System.out.println(element);
        }
    }
}
