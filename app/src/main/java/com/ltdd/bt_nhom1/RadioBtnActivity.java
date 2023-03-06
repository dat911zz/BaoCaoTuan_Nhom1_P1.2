package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioBtnActivity extends AppCompatActivity {

    Button test;
    RadioButton r_a,r_b,r_c;
    TextView txtTB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn);
        controls();
        r_a.setOnCheckedChangeListener(listenerRadio);
        r_b.setOnCheckedChangeListener(listenerRadio);
        r_c.setOnCheckedChangeListener(listenerRadio);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r_b.isChecked())
                {
                    txtTB.setText("Đúng rồi");
                }
                else
                {
                    txtTB.setText("Sai");
                }
            }
        });

    }

    public void controls()
    {
        r_a = findViewById(R.id.dapAn1);
        r_b = findViewById(R.id.dapAn2);
        r_c = findViewById(R.id.dapAn3);
        test = findViewById(R.id.btn_ketQua);
        txtTB = findViewById(R.id.txtKQ);

    }
    CompoundButton.OnCheckedChangeListener listenerRadio = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            test.setEnabled(true);
            if(isChecked)
            {
                txtTB.setText("Bạn chọn" + buttonView.getText());
            }
        }
    };
}