package javapart4;

public class Questionmanagement {
    private Question[] questions;


    public Questionmanagement(Question[] questions) {
        this.questions = questions;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public void phandokho(String DK) {
        String a = "Dễ";
        String b = "TB";
        String c = "Khó";
        if (DK.equals(a)) {
            for (int i = 0; i < questions.length; i++) {
                if (questions[i].getDokho() == a) {
                    System.out.println(questions[i].getNoidung());
                    System.out.println(questions[i].getDapan1() + questions[i].getDapan2() + questions[i].getDapan3() + questions[i].getDapan4());
                }
            }
        }
        if (DK.equals(b)) {
            for (int i = 0; i < questions.length; i++) {
                if (questions[i].getDokho() == b) {
                    System.out.println(questions[i].getNoidung());
                    System.out.println(questions[i].getDapan1() + questions[i].getDapan2() + questions[i].getDapan3() + questions[i].getDapan4());
                }
            }
        }
        if (DK.equals(c)) {
            for (int i = 0; i < questions.length; i++) {
                if (questions[i].getDokho() == a) {
                    System.out.println(questions[i].getNoidung());
                    System.out.println(questions[i].getDapan1() + questions[i].getDapan2() + questions[i].getDapan3() + questions[i].getDapan4());
                }
            }
        }

    }

    public void kiemtraketqua (String [] j,String DK){
        int k =0;
        for (int i = 0; i <questions.length;i++){
           if (questions[i].getDokho().equals(DK) && questions[i].getDapandung().equals(j[k])){
               k++;
               System.out.println(k+"."+questions[i].getDapandung());
           }
          }
        System.out.println("So dap an đung:"+k);
        }

    }

