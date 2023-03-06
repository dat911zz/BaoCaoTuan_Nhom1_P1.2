package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleBtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);//Set mặc định theme light
        setContentView(R.layout.activity_toggle_btn);
        bindEventForToggleButton();
    }
    public void bindEventForToggleButton(){
        //style="@android:style/Widget.Button.Toggle"
        //style="@android:style/Widget.Holo.Light.Button.Toggle"
        //style="@android:style/Widget.Material.Button.Toggle"

        ToggleButton tgl1 = findViewById(R.id.tglBtn1);
        TextView txtResult = findViewById(R.id.txtResult);
        txtResult.setText("Toggle button is Off");
        ToggleButton tglBG = findViewById(R.id.tglBtnBg);
        ConstraintLayout ll = findViewById(R.id.constraint_layout_togglebtn);

        //Cách 1
        tgl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("Toggle button is " + (tgl1.isChecked() ? "On" : "Off"));
            }
        });
        //Cách 2
        tgl1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                txtResult.setText("Toggle button is " + (b ? "On" : "Off"));
            }
        });

        //Đổi màu nền khi click
        tglBG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ll.setBackgroundColor(ContextCompat.getColor(compoundButton.getContext(), R.color.violet));
                }else{
                    ll.setBackgroundColor(ContextCompat.getColor(compoundButton.getContext(), R.color.white));
                }

            }
        });
    }
}