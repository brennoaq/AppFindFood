package com.example.findfood;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DescriptionActivity extends AppCompatActivity {


    Restaurante restaurante;

    @BindView(R.id.tv_description)
    TextView tv_description;

    @BindView(R.id.tv_descriptionName)
    TextView tv_descriptionName;

    @BindView(R.id.im_description)
    ImageView im_description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_description);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        restaurante = (Restaurante) getIntent().getSerializableExtra("restaurante");

        setTitle(restaurante.getTitle());

        tv_descriptionName.setText(restaurante.getTitle());
        tv_descriptionName.setTextColor(Color.parseColor(restaurante.getColorName()));
        tv_description.setText(restaurante.getDescription());

        Glide.with(this)
                .load(restaurante.getImage())
                .fitCenter()
                .into(im_description);
    }


    @OnClick(R.id.maps)
    public void goMaps() {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("restaurante", restaurante);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
