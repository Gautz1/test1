package com.example.gautamdhariharan.semadio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.id;

public class homeScreen extends AppCompatActivity {

    private WindowManager screen;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        home_setup();
    }

    void home_setup(){
        ScreenParam sp = new ScreenParam();
        int width = sp.getScreenWidth(homeScreen.this);int height = sp.getScreenHeight(homeScreen.this);
        TextView text;
        ll=(LinearLayout)findViewById(R.id.adll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);text.setHeight((int)(height/2.5));
        }
        ll=(LinearLayout)findViewById(R.id.engll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);text.setHeight(height/3);
        }
        ll=(LinearLayout)findViewById(R.id.hinll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);text.setHeight(height/3);
        }
        ll=(LinearLayout)findViewById(R.id.tamll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);text.setHeight(height/3);
        }
        ll=(LinearLayout)findViewById(R.id.mpll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);text.setHeight(height/3);
        }
        ll=(LinearLayout)findViewById(R.id.telll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);text.setHeight(height/3);
        }
        text = (TextView)findViewById(R.id.mostviewed);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.english);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.hindi);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.tamil);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.telugu);
        text.setHeight(height/5);
    }

    public void click(View v){
        Intent i = new Intent(this,video.class);
        startActivity(i);
    }

}
