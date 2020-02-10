package com.rayantrisha.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button submitButton;
    int i=1;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        text = findViewById(R.id.responseTextView);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Log.i("test","hello");
                text.setText(""+ ++i);




            }
        });
    }
}
