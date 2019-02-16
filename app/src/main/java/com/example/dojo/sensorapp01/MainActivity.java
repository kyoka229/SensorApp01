package com.example.dojo.sensorapp01;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager sm = (SensorManager)this.getSystemService(Context.SENSOR_SERVICE);
        List<Sensor>sensors = sm.getSensorList(Sensor.TYPE_ALL);
        for (Sensor s: sensors){
            Log.d("SENSOR","name:" + s.getName() + String.valueOf(s.getType()));
        }

        Sensor accSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this, accSensor, SensorManager.SENSOR_DELAY_NORMAL);

    }


    @Override
    public void  onSensorChanged(SensorEvent sev){
        float[] val = sev.values;
        Log.d("SENSOR","x:" + val[0] + "y:" + val[1] + "z:" + val[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor s,int ac){

    }
}
