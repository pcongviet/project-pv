package javapart4;

public class Test {
    public static void main (String[] args) {
        Student sinhvien1 = new Student("Nguyen van a",18,9.5f,"nu");
        Student[] sinhvien = new Student [3];
        sinhvien[0]= sinhvien1;
        sinhvien[1]= new Student("nguyen van b",18,7.3f,"nam");
        sinhvien[2]= new Student("nguyen van c",18,10f,"nam");
        Student temp ;
        for (int i = 0; i<3;i++){
            for (int j= i +1;j<3;j++){
                if (sinhvien[i].getPoint() <sinhvien[j].getPoint()){
                    temp = sinhvien[i];
                    sinhvien[i]=sinhvien[j];
                    sinhvien[j]=temp;
                }
            }
        }
        for (Student a :sinhvien){
            System.out.println(a.getName()+" "+a.getPoint());
        }




    }
}
