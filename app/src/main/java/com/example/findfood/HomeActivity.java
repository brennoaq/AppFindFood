package com.example.findfood;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.im_mcdonalds,R.id.ll_mcdonalds,R.id.tv_mcdonalds})
    public void goMcdonalds(){
        Intent intent = new Intent(this, DescriptionActivity.class);
        startActivity(intent);
    }
    @OnClick({R.id.im_diRoma,R.id.ll_diRoma,R.id.tv_diRoma})
    public void godiroma(){
        Intent intent = new Intent(this, DescriptionActivity.class);
        startActivity(intent);
    }
    @OnClick({R.id.im_moochacho,R.id.ll_moochacho,R.id.tv_moochacho})
    public void gomoochacho(){
        Intent intent = new Intent(this, DescriptionActivity.class);
        startActivity(intent);
    }

}
