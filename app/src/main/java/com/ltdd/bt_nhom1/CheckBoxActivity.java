package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    CheckBox android, java, python, php, unity3D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        addControls();
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.isChecked())
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_SHORT).show();
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (java.isChecked())
                    Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_SHORT).show();
            }
        });
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (php.isChecked())
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_SHORT).show();
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (python.isChecked())
                    Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_SHORT).show();
            }
        });
        unity3D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (unity3D.isChecked())
                    Toast.makeText(getApplicationContext(), "Unity 3D", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void addControls()
    {
        android = (CheckBox) findViewById(R.id.chkAndroid);
        java = (CheckBox) findViewById(R.id.chkJava);
        python = (CheckBox) findViewById(R.id.chkPython);
        php = (CheckBox) findViewById(R.id.chkPHP);
        unity3D = (CheckBox) findViewById(R.id.chkUnity);
    }


}