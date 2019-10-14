package com.example.findfood;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HomeAdapter extends BaseAdapter {

    private ArrayList<Restaurante> restaurantes;
    Context mContext;

    public HomeAdapter(ArrayList<Restaurante> restaurantes, Context mContext) {
        this.restaurantes = restaurantes;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return restaurantes.size();
    }

    @Override
    public Object getItem(int i) {
        return restaurantes.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.item, viewGroup, false);

        Restaurante rest = restaurantes.get(i);

        view.getBackground().setColorFilter(Color.parseColor(rest.getColorBackground()), PorterDuff.Mode.SRC);

//        view.setBackgroundColor(Color.parseColor(rest.getColorBackground()));

        ImageView logo = view.findViewById(R.id.im_mcdonalds);

        Glide.with(mContext)
                .load(rest.getImage())
                .fitCenter()
                .into(logo);

        TextView desc = view.findViewById(R.id.tv_mcdonalds);

        desc.setText(rest.getTitle());
        desc.setTextColor(Color.parseColor(rest.getColorName()));

        view.setOnClickListener((v) -> {
            Intent intent = new Intent(mContext, DescriptionActivity.class);
            intent.putExtra("restaurante", rest);
            mContext.startActivity(intent);
        });

        return view;
    }
}
