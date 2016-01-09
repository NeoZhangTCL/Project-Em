package com.example.neozhang.test1;

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
        RecyclerView recycler = (RecyclerView)parent.findViewById(R.id.recycler_view);
        /*
        public View inflate (XmlPullParser parser, ViewGroup root, boolean attachToRoot)
        parser	XML dom node containing the description of the view hierarchy.
        root	Optional view to be the parent of the generated hierarchy (if attachToRoot is true), or else simply an object that provides a set of LayoutParams values for root of the returned hierarchy (if attachToRoot is false.)
        attachToRoot	Whether the inflated hierarchy should be attached to the root parameter? If false, root is only used to create the correct subclass of LayoutParams for the root view in the XML.
         */
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, recycler, false);
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
        this.notifyItemRangeInserted(1,1);
    }

    public void addCard(String q, String a){
        Cards newCard = new Cards(q,a);
        cards.add(0,newCard);
    }
}
