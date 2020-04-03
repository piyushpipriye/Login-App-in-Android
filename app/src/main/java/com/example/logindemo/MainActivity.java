package com.example.logindemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1;
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = et1.getText().toString().trim();
                String pwdd =  et2.getText().toString();

                if(uname.isEmpty())
                {
                    et1.setError("Username Required");
                }
                else if(pwdd.isEmpty()) {
                    et2.setError("Password Required");
                }

                else if(uname.equals("12") && pwdd.equals("#12") ) {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("message");
                    alertDialog.setMessage("login successful");
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alertDialog.show();
                    et1.setText(null);
                    et2.setText(null);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
                    et1.setText(null);
                    et2.setText(null);
                }
            }
        });
    }
}
