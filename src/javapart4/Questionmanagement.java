package javapart4;

public class Questionmanagement {
    private Question [] questions;

    public Questionmanagement(Question[] questions) {
        this.questions = questions;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
    public void phandokhode(){
        String a = "Dễ";
        for (int i =0;i<questions.length;i++){
            if (questions[i].getDokho() == a){
                System.out.println(questions[i].getNoidung());
                System.out.println(questions[i].getDapan1()+questions[i].getDapan2()+questions[i].getDapan3()+questions[i].getDapan4());
            }
        }
    }
    public void phandokhoTB(){
        String b = "TB";
        for (int i =0;i<questions.length;i++){
            if (questions[i].getDokho() == b){
                System.out.println(questions[i].getNoidung());
                System.out.println(questions[i].getDapan1()+questions[i].getDapan2()+questions[i].getDapan3()+questions[i].getDapan4());
            }
        }
    }
    public void phandokhoKho(){
        String c = "Khó";
        for (int i =0;i<questions.length;i++){
            if (questions[i].getDokho() == c){
                System.out.println(questions[i].getNoidung());
                System.out.println(questions[i].getDapan1()+questions[i].getDapan2()+questions[i].getDapan3()+questions[i].getDapan4());
            }
        }
    }

















}
