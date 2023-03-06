package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class SwitchActivity extends AppCompatActivity {
    TextView textView;
    Switch switchCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        bindEventForSwitch();
    }
    public void bindEventForSwitch(){
        textView = findViewById(R.id.textview_id);
        switchCompat = findViewById(R.id.switch_id);

        switchCompat.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton,
                                                 boolean b) {
                        textView.setText("Switch is " +
                                (b ? "On" : "Off"));
                    }
                });
    }
}