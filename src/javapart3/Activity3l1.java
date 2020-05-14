package javapart3;

public class Activity3l1 {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4};
        int[] array2 = {2,5,7,8};
        int[] array3 = new int[array1.length+array2.length];
        int a = 0 ;
        int b = 0;
        int k = 0;
        while (a<array1.length&&b<array2.length) {

                if (array1[a] < array2[b]) {
                array3[k] = array1[a];
                k++;
                a++;
            } else if (array1[a] == array2[b]) {
                array3[k] = array1[a];
                array3[k=k+1] = array2[b];
                k++;
                a++;
                b++;
            } else ;
        }
        while (b<array2.length){
            array3[k++]=array2[b++];
        }
        for(int element:array3) {
            System.out.println(element);
        }




    }
}
