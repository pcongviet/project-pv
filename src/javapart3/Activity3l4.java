package javapart3;

public class Activity3l4 {
    public static void main(String []args){
        String a = "Hello student in PlusPlus Academy";
        System.out.println(a);
        // cat chuoi
        String [] b = a.split(" ");
        String c = "";
        // so sanh tong cac ki tu cua cac chuoi cua b va cua c
        for (int i = 0; i < b.length;i++){
            if (b[i].length()>=c.length()){
                c = b[i];
            }
        }

        System.out.println(c);
    }
}
