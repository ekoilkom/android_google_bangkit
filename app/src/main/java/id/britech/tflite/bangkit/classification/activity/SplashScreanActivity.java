package id.britech.tflite.bangkit.classification.activity;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import id.britech.tflite.bangkit.classification.ClassifierActivity;
import id.britech.tflite.bangkit.classification.R;

public class SplashScreanActivity extends AppCompatActivity {
    private static final int splashInterval = 1000;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screan_activity);
        context=this;
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                startLoginActivity();
            }
        }, splashInterval);
    }

    private void startLoginActivity() {
        Intent intent = new Intent(context, ClassifierActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        Bundle bndlanimation =
                ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
        startActivity(intent,bndlanimation);
    }

}
