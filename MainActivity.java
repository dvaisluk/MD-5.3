package com.example.popupnotifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Toast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Вы нажали кнопку!", Toast.LENGTH_SHORT);
        LinearLayout toastContainer = (LinearLayout) toast.getView();

        toast.show();
    }
}