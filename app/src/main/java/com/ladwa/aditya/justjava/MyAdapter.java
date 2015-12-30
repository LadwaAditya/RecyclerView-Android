package com.ladwa.aditya.justjava;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Aditya on 30-Dec-15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public LinearLayout mlLinearLayout;

        public ViewHolder(LinearLayout view, TextView textView) {
            super(view);
            mlLinearLayout = view;
            mTextView = textView;
        }
    }

    public MyAdapter(String[] mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.textview_holder, parent, false);
        TextView tv = (TextView) view.findViewById(R.id.mytext);
        ViewHolder viewHolder = new ViewHolder((LinearLayout) view, tv);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
