package activities.group_one_activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView group_logo;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        group_logo = findViewById(R.id.group_logo);
        lottie = findViewById(R.id.lottie);

        lottie.setRepeatCount(4);

        lottie.playAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), OpenMainActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}
