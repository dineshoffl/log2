package com.example.dell.log;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        onclick();
    }public void onclick(){
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                        startActivity(intent);
                        Toast.makeText(Main2Activity.this, "github", Toast.LENGTH_SHORT).show();
                        Toast.makeText(Main2Activity.this, "github2", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
