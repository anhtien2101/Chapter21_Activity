package com.example.activity.chapter21_startmapactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtLat = null;
    EditText edtLong = null;
    Button btnShow = null;
    private String latitude = "";
    private String longtitude = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLat = (EditText) findViewById(R.id.edtLat);
        edtLong = (EditText) findViewById(R.id.edtLong);
        btnShow = (Button) findViewById(R.id.btnShowMap);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latitude = edtLat.getText().toString();
                longtitude = edtLong.getText().toString();
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                i.putExtra("lat", latitude);
                i.putExtra("long", longtitude);
                startActivity(i);
            }
        });
    }
}
