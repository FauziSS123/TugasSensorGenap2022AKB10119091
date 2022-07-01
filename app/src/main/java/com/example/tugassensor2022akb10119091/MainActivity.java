package com.example.tugassensor2022akb10119091;
//        nim : 10119091
//        nama : muhammadrojabinurfauzi
//        keals : if3
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.gms.maps.MapFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //inisialisasi fragment
//        Fragment fragment = new fragment1();
//
//        //buka fragment
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

        //manggil fragment
        BottomNavigationView bottomNavigationView = findViewById((R.id.bottomNavigationView));
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.fragment1, R.id.fragment2, R.id.fragment3).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}