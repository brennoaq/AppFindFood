package com.example.findfood;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DescriptionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_description);

        ButterKnife.bind(this);

    }


    @OnClick(R.id.maps)
    public void goMaps(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


}
