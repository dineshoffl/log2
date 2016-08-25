package com.example.dell.log;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private static EditText editt1;
    private  static  EditText editT2;
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }public void login(){
        editt1=(EditText)findViewById(R.id.editText);
         editT2=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button);

button.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editt1.getText().toString().equals("dinesh")&&editT2.getText().toString().equals("kumar")){
                    Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }else {
                    AlertDialog.Builder dlgAlert = new AlertDialog.Builder(MainActivity.this);

                    dlgAlert.setMessage("wrong password or username");
                    dlgAlert.show();
                } }});
}
            }




