package com.example.neozhang.test1;

/**
 * Created by Neo Zhang on 2016-01-01.
 */
public class Cards {

    private String questionString;
    private String answerString;

    public Cards(String q, String a){
        this.questionString = q;
        this.answerString = a;
    }

    public String getQuestionString(){
        return this.questionString;
    }

    public String getAnswerString(){
        return this.answerString;
    }

    public void setQuestionString(String question){
        this.questionString = question;
    }

    public void setAnswerString(String answer){
        this.answerString = answer;
    }

}
