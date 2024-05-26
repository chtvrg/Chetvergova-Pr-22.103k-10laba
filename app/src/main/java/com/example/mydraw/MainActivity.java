package com.example.mydraw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Picture;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Draw2D draw2D = new Draw2D(this);
//        setContentView(draw2D);
        MyDraw myDraw = new MyDraw(this);
        setContentView(myDraw);
    }
}
