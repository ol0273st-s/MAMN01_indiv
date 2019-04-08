package com.example.mamn01_indiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnComp;
    private Button btnAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnAcc = (Button) findViewById(R.id.btnAccel);
        this.btnComp = (Button) findViewById(R.id.btnCompass);
    }
    public void btnCompOnClick(View v){
        Intent i = new Intent(this, Compass.class);
        startActivity(i);

    }
    public void btnAccOnClick(View v){
        Intent i = new Intent(this, Accel.class);
        startActivity(i);
    }
}
