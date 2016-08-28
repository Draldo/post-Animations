package com.example.draldo.animations;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.main_btn);
    }

    public void doMagic(View view) {
        ObjectAnimator scaleAnim = ObjectAnimator.ofFloat(mButton, "scaleX", 1.0f, 2.0f);
        scaleAnim.setDuration(5000);
        scaleAnim.setRepeatCount(ValueAnimator.INFINITE);
        scaleAnim.setRepeatMode(ValueAnimator.REVERSE);
        scaleAnim.start();
        ObjectAnimator fadeAnim = ObjectAnimator.ofFloat(mButton, "alpha", 0.2f);
        fadeAnim.start();

    }
}
