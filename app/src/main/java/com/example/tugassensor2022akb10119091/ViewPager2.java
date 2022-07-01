package com.example.tugassensor2022akb10119091;
//        nim : 10119091
//        nama : muhammadrojabinurfauzi
//        keals : if3
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPager2 extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Intent pindahIntent = new Intent(ViewPager2.this, MainActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }
}