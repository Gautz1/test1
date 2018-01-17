package com.example.gautamdhariharan.semadio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;

public class video extends AppCompatActivity {

    WindowManager screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ScreenParam sp = new ScreenParam();
        int width=sp.getScreenWidth(video.this),height=sp.getScreenHeight(video.this);
        TextView textView = (TextView)findViewById(R.id.video);
        textView.setHeight(height/2);
        textView = (TextView)findViewById(R.id.suggestion1);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.suggestion2);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.suggestion3);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.suggestion4);
        textView.setHeight(height/3);
    }
}
