package javapart4;

public class Question {
    private String noidung;
    private String dapan1;
    private String dapan2;
    private String dapan3;
    private String dapan4;
    private String dapandung;
    private String dokho;

    public Question(String noidung, String dapan1, String dapan2, String dapan3, String dapan4, String dapandung, String dokho) {
        this.noidung = noidung;
        this.dapan1 = dapan1;
        this.dapan2 = dapan2;
        this.dapan3 = dapan3;
        this.dapan4 = dapan4;
        this.dapandung = dapandung;
        this.dokho = dokho;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getDapan1() {
        return dapan1;
    }

    public void setDapan1(String dapan1) {
        this.dapan1 = dapan1;
    }

    public String getDapan2() {
        return dapan2;
    }

    public void setDapan2(String dapan2) {
        this.dapan2 = dapan2;
    }

    public String getDapan3() {
        return dapan3;
    }

    public void setDapan3(String dapan3) {
        this.dapan3 = dapan3;
    }

    public String getDapan4() {
        return dapan4;
    }

    public void setDapan4(String dapan4) {
        this.dapan4 = dapan4;
    }

    public String getDapandung() {
        return dapandung;
    }

    public void setDapandung(String dapandung) {
        this.dapandung = dapandung;
    }

    public String getDokho() {
        return dokho;
    }

    public void setDokho(String dokho) {
        this.dokho = dokho;
    }
}
