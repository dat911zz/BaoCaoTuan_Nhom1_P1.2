package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.google.android.material.chip.Chip;

public class ChipGroupActivity extends AppCompatActivity {

    Chip chipAction, chipEntry, chipChoice, chipFilter, chipCustom;
    Button btnClear;
    EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_group);

        chipAction = (Chip) this.findViewById(R.id.chipAction);
        chipEntry = (Chip) this.findViewById(R.id.chipEntry);
        chipChoice = (Chip) this.findViewById(R.id.chipChoice);
        chipFilter = (Chip) this.findViewById(R.id.chipFilter);
        chipCustom = (Chip) this.findViewById(R.id.chipCustom);
        btnClear = (Button) this.findViewById(R.id.btnClear);
        editTextMessage = (EditText) this.findViewById(R.id.editTextMessage);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMessage.setText("");
            }
        });

        chipAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMessage.setText("Clicked");
            }
        });

        chipEntry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                editTextMessage.setText("isCheck?"+b);
            }
        });

        chipEntry.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMessage.setText("Close Icon Clicked");
            }
        });

        chipFilter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                editTextMessage.setText("isCheck?"+b);
            }
        });

        chipChoice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                editTextMessage.setText("isCheck?"+b);
            }
        });

        chipCustom.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMessage.setText("Close Icon Clicked");
            }
        });

        chipCustom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                editTextMessage.setText("Checked Changed! isCheck? "+ b);
            }
        });

    }
}