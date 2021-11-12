package com.example.projectforbagrut;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map_Activity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
private  LatLng sydney = new LatLng(32.822321, 34.956248);
private  LatLng S = new LatLng(-34, 151);
private boolean checkMarker = false;
private View buttonLocation;
private View buttonLocationClose;
private   Marker perth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().position(sydney).title("SkatePark Haifa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        mMap.addMarker(new MarkerOptions().position(S).title("sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(S));
        MapStyleOptions style = MapStyleOptions.loadRawResourceStyle(this, R.raw.j);
        googleMap.setMapStyle(style);

    }
    public void Location (View view){
        if(checkMarker == false){
            buttonLocation = view;
           view.setVisibility(View.INVISIBLE);
           if(buttonLocationClose != null)  {buttonLocationClose.setVisibility(View.VISIBLE);}
            final LatLng perthLocation = new LatLng(-31.90, 115.86);
            perth = mMap.addMarker(
                    new MarkerOptions().position(perthLocation).draggable(true));

            checkMarker = true;
        }
    }
    public void delete (View view){
        view.setVisibility(View.INVISIBLE);
        buttonLocation.setVisibility(View.VISIBLE);
        perth.remove();
        checkMarker = false;
buttonLocationClose = view;
    }

    public void maps(View view) {
        Intent intent=new Intent();
        intent.setClass(this, Map_Activity.class);

        startActivity(intent);
        finish();

    }
    public void profile (View view) {
        Intent intent=new Intent();
      //  intent.setClass(this, .class);

        startActivity(intent);
        finish();

    }
    public void home (View view) {
        Intent intent=new Intent();
        intent.setClass(this, MainActivity.class);

        startActivity(intent);
        finish();

    } public void friends (View view) {
        Intent intent=new Intent();
       // intent.setClass(this, .class);

        startActivity(intent);
        finish();

    }
}