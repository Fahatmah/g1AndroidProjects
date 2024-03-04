package activities.group_one_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {
    private Button incrementButton;
    private Button toastButton;
    private TextView toast_number;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        incrementButton = findViewById(R.id.incrementNumber);
        toast_number = findViewById(R.id.toast_number);
        toastButton = findViewById(R.id.toastButton);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementNumber();
                toast_number.setText(String.valueOf(count));

                Log.v("ToastActivity", "The number is : " + count);
                Log.e("ToastActivity", "The number is : " + count);
                Log.d("ToastActivity", "The number is : " + count);
                Log.w("ToastActivity", "The number is : " + count);
                Log.i("ToastActivity", "The number is : " + count);
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toast();
            }
        });
    }

    public void incrementNumber(){
        count++;
    }

    public void toast(){
        Toast.makeText(ToastActivity.this, "The number is " + count, Toast.LENGTH_SHORT).show();
    }


}