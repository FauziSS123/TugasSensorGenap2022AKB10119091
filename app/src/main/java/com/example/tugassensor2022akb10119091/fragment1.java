package com.example.tugassensor2022akb10119091;
//        nim : 10119091
//        nama : muhammadrojabinurfauzi
//        keals : if3
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inisialisasi view
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        // inisialisasi map fragment
        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.google_map);

        //async map
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                LatLng Lokasi1 = new LatLng(-6.970272042954911, 107.57282673435019);
                LatLng Lokasi2 = new LatLng(-6.971325156503477, 107.57376712711844);
                LatLng Lokasi3 = new LatLng(-6.971213462754458, 107.57590511409578);
                LatLng Lokasi4 = new LatLng(-6.969490184395742, 107.57467536970657);
                LatLng Lokasi5 = new LatLng(-6.967846681518043, 107.57157287720563);
                LatLng Lokasi6 = new LatLng(-6.971069856469486, 107.57399217831254);
                googleMap.setMapType(googleMap.MAP_TYPE_HYBRID);
                googleMap.addMarker(new MarkerOptions().position(Lokasi1).title("Gerbang Kopi"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi2).title("Old coffee express"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi3).title("KANDANG SUSU BANDUNG"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi4).title("Ayam Goreng Nelongso Kopo Sayati"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi5).title("Bapiah Ayam Panas"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi6).title("Rumah"));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Lokasi6, 17));

                //ketika map loading
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng latLng) {
                        //ketika map diklik
                        //Initialize marker option
                        MarkerOptions markerOptions = new MarkerOptions();
                        //atur posisi penanda
                        markerOptions.position(latLng);
                        //atur judul penanda
                        markerOptions.title(latLng.latitude + " : " + latLng.longitude);
                        //hapus semua penanda
                        googleMap.clear();
                        //animasi memperbesar penanda
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                latLng, 10
                        ));
                        //menambahkan penanda pada map
                        googleMap.addMarker(markerOptions);
                    }
                });
            }
        });
        return view;
    }
}