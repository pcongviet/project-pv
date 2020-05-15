package javapart3;

public class Activity3l2 {
    public static void main(String[] args) {
        int [] a = {20,20,30,40,50,50,50};
        int [] b = new int[4] ;
        int j= 0;
        for ( int i =0;i<a.length-1  ; i++ ) {
            if(a[i]!=a[i+1]){
                b[j]=a[i];j++;
            }
        }
        b[j]=a[a.length-1];

        for(int element:b){
            System.out.println(element);
        }
    }
}
