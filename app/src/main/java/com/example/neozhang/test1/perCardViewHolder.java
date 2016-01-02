package com.example.neozhang.test1;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Neo Zhang on 2016-01-02.
 */
public class perCardViewHolder extends RecyclerView.ViewHolder{

    protected TextView questions;
    protected TextView answers;
    protected CardView cardView;

    public perCardViewHolder(View view) {
        super(view);
        this.questions = (TextView) view.findViewById(R.id.card_view_questions);
        this.answers = (TextView) view.findViewById(R.id.card_view_answers);
        this.cardView = (CardView) view.findViewById(R.id.cardItem);
        view.setClickable(true);
    }

    public void setQuestionsView(Cards singleCard){
        this.questions.setText(singleCard.getQuestionString());
    }

    public void setAnswersView(Cards singleCard){
        this.answers.setText(singleCard.getAnswerString());
    }
}
