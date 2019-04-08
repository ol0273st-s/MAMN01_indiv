package com.example.mamn01_indiv;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Accel extends AppCompatActivity implements SensorEventListener {

    private TextView txt_accel;
    private float[] orientation = new float[3];
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accel);
        txt_accel = findViewById(R.id.txt_acc);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        orientation[0] = (float) event.values[0];
        orientation[1] = (float) event.values[1];
        orientation[2] = (float) event.values[2];
        txt_accel.setText("x:"+orientation[0]+"\n"+"y:"+orientation[1]+"\n"+"z:"+orientation[2]+"\n");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//no relevant action(TextView)
    }
}
