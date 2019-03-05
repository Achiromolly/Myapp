package com.example.molly.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeACtivity extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);

//         bt= findViewById(R.id.church);

    }
    public void churches(View view){
        Intent intent = new Intent(this,ChurchActivity.class);
        startActivity(intent);
    }
    public void mos(View view) {
        Intent intent = new Intent(this, MosqueActivity.class);
        startActivity(intent);
    }
}
