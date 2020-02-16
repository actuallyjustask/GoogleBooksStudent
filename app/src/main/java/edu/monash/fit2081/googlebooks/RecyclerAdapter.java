package edu.monash.fit2081.googlebooks;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    ArrayList<GoogleBook> data;



    public RecyclerAdapter(ArrayList<GoogleBook> _data) {
        super();
        data = _data;
        Log.d("stock", "got data with size=" + _data.size());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false); //CardView inflated as RecyclerView list item
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        viewHolder.itemBook.setText(data.get(position).getBookTitle());
        viewHolder.itemAuthor.setText(data.get(position).getAuthors());
        viewHolder.itemPublishedDate.setText(data.get(position).getPublishedDate());
        viewHolder.itemSubTitle.setText(data.get(position).getSubTitle());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView itemBook;
        public TextView itemAuthor;
        public TextView itemPublishedDate;
        public TextView itemSubTitle;



        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            itemBook = itemView.findViewById(R.id.book_tv);
            itemAuthor = itemView.findViewById(R.id.author_tv);
            itemPublishedDate = itemView.findViewById(R.id.book_published_tv);
            itemSubTitle = itemView.findViewById(R.id.subtitle_tv);

        }
    }


}


