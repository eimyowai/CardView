package com.example.grammarguide;

public class Art {

    private String Id;
    private String Question;
    private String Radio1;
    private String Radio2;
    private String Radio3;
    private String Radio4;
    private String Correct;

    public Art(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getRadio1() {
        return Radio1;
    }

    public void setRadio1(String radio1) {
        Radio1 = radio1;
    }

    public String getRadio2() {
        return Radio2;
    }

    public void setRadio2(String radio2) {
        Radio2 = radio2;
    }

    public String getRadio3() {
        return Radio3;
    }

    public void setRadio3(String radio3) {
        Radio3 = radio3;
    }

    public String getRadio4() {
        return Radio4;
    }

    public void setRadio4(String radio4) {
        Radio4 = radio4;
    }

    public String getCorrect() {
        return Correct;
    }

    public void setCorrect(String correct) {
        Correct = correct;
    }

    public Art(String id, String question, String radio1, String radio2, String radio3, String radio4, String correct) {
       Id=id;
        Question = question;
        Radio1 = radio1;
        Radio2 = radio2;
        Radio3 = radio3;
        Radio4 = radio4;
        Correct = correct;
    }
}
