package javapart4;

public class Studentman {
    private int totalSv;
    private Students[] students;

    public int getTotalSv() {
        return totalSv;
    }

    public void setTotalSv(int totalSv) {
        this.totalSv = totalSv;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public Studentman(Students[] students) {
        this.students = students;
        this.totalSv = this.students.length;


    }

     void insoSVdo() {
        int a = 0;
        for (int i = 0; i < totalSv; i++) {
            if (students[i].getGpa() >= 1.5) {
                a++;
            }
        }
        System.out.println("so sinh do:"+a);
    }

    void insoSVtruot() {
        int b = 0;
        for (int i = 0; i < totalSv; i++) {
            if (students[i].getGpa() < 1.5) {
                b++;
            }
        }
        System.out.println("so sinh truot:"+b);
    }
    public void svGPAmax() {
        float max = students[0].getGpa();
        String svGPAmax = students[0].getName();
        for (int i = 0; i < totalSv; i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa() ;
                svGPAmax = students[i].getName() ;
            }
        }
        System.out.println("SV co GPA cao nhat la: " + svGPAmax);
    }

    public void svGPAmin() {
        float min = students[0].getGpa();
        String svGPAmin = students[0].getName();
        for (int i = 0; i < totalSv; i++) {
            if (students[i].getGpa() < min) {
                min = students[i].getGpa() ;
                svGPAmin = students[i].getName() ;
            }
        }
        System.out.println("SV co GPA thap nhat la: " + svGPAmin);
    }
}
