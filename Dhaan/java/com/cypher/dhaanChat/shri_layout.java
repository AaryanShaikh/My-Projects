package com.koddev.dhaanChat;

/*import androidx.appcompat.app.AppCompatActivity;*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class shri_layout extends AppCompatActivity {
    TextView donate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shri_layout);

        donate_btn = (TextView) findViewById(R.id.donate_btn);

        donate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shri_layout.this,donation.class);
                Toast.makeText(shri_layout.this,"Donate to Shri",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
