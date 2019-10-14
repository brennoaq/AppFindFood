package com.example.findfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity {

    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(mMap -> {
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

            mMap.clear(); //clear old markers

            CameraPosition googlePlex = CameraPosition.builder()
                    .target(new LatLng(37.4219999,-122.0862462))
                    .zoom(10)
                    .bearing(0)
                    .tilt(45)
                    .build();

            mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex), 10000, null);



            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(37.4629101,-122.2449094))
                    .title("Iron Man")
                    .snippet("His Talent : Plenty of money"));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(37.3092293,-122.1136845))
                    .title("Captain America"));
        });
    }
}
