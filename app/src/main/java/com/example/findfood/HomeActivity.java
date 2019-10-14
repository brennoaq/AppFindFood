package com.example.findfood;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeActivity extends AppCompatActivity {

    ArrayList<Restaurante> restaurantes = new ArrayList<>();
    HomeAdapter adapter;

    @BindView(R.id.dashRestaurante)
    ListView dashRestaurante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        FirebaseDatabase.getInstance().getReference().child("restaurantes").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    restaurantes.clear();

                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        restaurantes.add(snapshot.getValue(Restaurante.class));
                    }
                    adapter = new HomeAdapter(restaurantes, HomeActivity.this);
                    dashRestaurante.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


}
