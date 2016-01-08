package com.example.neozhang.test1;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Neo Zhang on 2016-01-02.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<perCardViewHolder>{

    private List<Cards> cards;

    public RecyclerViewAdapter(List<Cards> input){
        this.cards = input;
    }

    /*
     *This method get view from the cardview layout, and by perCardViewHolder method
     * make a new perCardViewHolder, and return it.
     */
    @Override
    public perCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView)parent.findViewById(R.id.cardItem);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, cardView, false);
        perCardViewHolder holder = new perCardViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(perCardViewHolder holder, int position) {
        Cards perCard = cards.get(position);

        holder.setQuestionsView(perCard);
        holder.setAnswersView(perCard);

    }

    @Override
    public int getItemCount() {
        if (null != cards){
            return cards.size();
        }
        else return 0;
    }

    public void addCard(Cards newCard){
        cards.add(1,newCard);
    }

    public void addCard(String q, String a){
        Cards newCard = new Cards(q,a);
        cards.add(1,newCard);
    }
}
