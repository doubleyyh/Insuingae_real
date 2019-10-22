package com.example.insuingae.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class writeActivity extends AppCompatActivity {

    TextView titleTextview;
    TextView contentTextView;

    ImageView imageView;
    VideoView videoView;
    SoundPool sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_write);
    }
}
