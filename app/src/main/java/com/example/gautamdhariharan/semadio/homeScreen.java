package com.example.gautamdhariharan.semadio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class homeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void click(View v){
        Intent i=new Intent();
        switch(v.getId()) {
            case R.id.textView1:
                i = new Intent(this, video.class);
                break;
            case R.id.textView2:
                i = new Intent(this, video.class);
                break;
            case R.id.textView3:
                i = new Intent(this, video.class);
                break;
            case R.id.textView4:
                i = new Intent(this, video.class);
                break;
            case R.id.textView5:
                i = new Intent(this, video.class);
                break;
            case R.id.textView6:
                i = new Intent(this, video.class);
                break;
            case R.id.textView7:
                i = new Intent(this, video.class);
                break;
            case R.id.textView8:
                i = new Intent(this, video.class);
                break;
            case R.id.textView10:
                i = new Intent(this, video.class);
                break;
            case R.id.textView11:
                i = new Intent(this, video.class);
                break;
            case R.id.textView12:
                i = new Intent(this, video.class);
                break;
            case R.id.textView13:
                i = new Intent(this, video.class);
                break;
            case R.id.textView14:
                i = new Intent(this, video.class);
                break;
            case R.id.textView15:
                i = new Intent(this, video.class);
                break;
            case R.id.textView16:
                i = new Intent(this, video.class);
                break;
            case R.id.textView17:
                i = new Intent(this, video.class);
                break;
            case R.id.textView19:
                i = new Intent(this, video.class);
                break;
            case R.id.textView20:
                i = new Intent(this, video.class);
                break;
            case R.id.textView21:
                i = new Intent(this, video.class);
                break;
            case R.id.textView22:
                i = new Intent(this, video.class);
                break;
            case R.id.textView23:
                i = new Intent(this, video.class);
                break;
            case R.id.textView24:
                i = new Intent(this, video.class);
                break;
            case R.id.textView25:
                i = new Intent(this, video.class);
                break;
            case R.id.textView26:
                i = new Intent(this, video.class);
                break;
            case R.id.textView28:
                i = new Intent(this, video.class);
                break;
            case R.id.textView29:
                i = new Intent(this, video.class);
                break;
            case R.id.textView30:
                i = new Intent(this, video.class);
                break;
            case R.id.textView31:
                i = new Intent(this, video.class);
                break;
            case R.id.textView32:
                i = new Intent(this, video.class);
                break;
            case R.id.textView33:
                i = new Intent(this, video.class);
                break;
            case R.id.textView34:
                i = new Intent(this, video.class);
                break;
            case R.id.textView35:
                i = new Intent(this, video.class);
                break;
            case R.id.textView37:
                i = new Intent(this, video.class);
                break;
            case R.id.textView38:
                i = new Intent(this, video.class);
                break;
            case R.id.textView39:
                i = new Intent(this, video.class);
                break;
            case R.id.textView40:
                i = new Intent(this, video.class);
                break;
            case R.id.textView41:
                i = new Intent(this, video.class);
                break;
            case R.id.textView42:
                i = new Intent(this, video.class);
                break;
            case R.id.textView43:
                i = new Intent(this, video.class);
                break;
            case R.id.textView44:
                i = new Intent(this, video.class);
                break;
            case R.id.textView46:
                i = new Intent(this, video.class);
                break;
            case R.id.textView47:
                i = new Intent(this, video.class);
                break;
            case R.id.textView48:
                i = new Intent(this, video.class);
                break;
            case R.id.textView49:
                i = new Intent(this, video.class);
                break;
            case R.id.textView50:
                i = new Intent(this, video.class);
                break;
            case R.id.textView51:
                i = new Intent(this, video.class);
                break;
            case R.id.textView52:
                i = new Intent(this, video.class);
                break;
            case R.id.textView53:
                i = new Intent(this, video.class);
                break;
        }
        startActivity(i);
    }

}
