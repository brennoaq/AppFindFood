package com.example.findfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void descriptionMcdonalds(View view)
    {
        Intent intent = new Intent(HomeActivity.this, DescriptionFragment.class);
        startActivity(intent);
    }

    public void descriptionDiRoma(View view)
    {
        Intent intent = new Intent(HomeActivity.this, DescriptionFragment.class);
        startActivity(intent);
    }

    public void descriptionMoochacho(View view)
    {
        Intent intent = new Intent(HomeActivity.this, DescriptionFragment.class);
        startActivity(intent);
    }

}
