package com.fragmentmhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener helpButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityFragment.class);
                startActivity(intent);
            }
        };
        Button helpBtn = (Button)findViewById(R.id.btnMhs);
        helpBtn.setOnClickListener(helpButtonListener);
    }
}
