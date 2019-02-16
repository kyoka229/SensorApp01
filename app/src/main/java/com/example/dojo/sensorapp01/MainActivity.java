package com.example.dojo.sensorapp01;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager sm = (SensorManager)this.getSystemService(Context.SENSOR_SERVICE);
        List<Sensor>sensors = sm.getSensorList(Sensor.TYPE_ALL);
        for (Sensor s: sensors){
            Log.d("SENSOR","name:" + s.getName() + String.valueOf(s.getType()));
        }

    }
}
