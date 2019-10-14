package com.example.findfood;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

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
        Intent intent = new Intent(this, MapsFragment.class);
        startActivity(intent);
    }


}
