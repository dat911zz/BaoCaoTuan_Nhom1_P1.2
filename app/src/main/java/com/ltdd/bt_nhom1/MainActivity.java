package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.chip.Chip;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindEventForMenu();
    }
    public void bindEventForMenu(){
        ListView lstV = findViewById(R.id.listMenu);
        lstV.setAdapter(new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Arrays.asList(
                "Radio Button",
                "Check Box",
                "Chip Group",
                "Switch",
                "Toggle Button",
                "Example"
        )));

        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent radIntent = new Intent(view.getContext(), RadioBtnActivity.class);
                        startActivity(radIntent);
                        break;
                    case 1:
                        Intent chkBoxIntent = new Intent(view.getContext(), CheckBoxActivity.class);
                        startActivity(chkBoxIntent);
                        break;
                    case 2:
                        Intent chipGrIntent = new Intent(view.getContext(), ChipGroupActivity.class);
                        startActivity(chipGrIntent);
                        break;
                    case 3:
                        Intent swIntent = new Intent(view.getContext(), SwitchActivity.class);
                        startActivity(swIntent);
                        break;
                    case 4:
                        Intent tglBIntent = new Intent(view.getContext(), ToggleBtnActivity.class);
                        startActivity(tglBIntent);
                        break;
                    case 5:
                        Intent exampleIntent = new Intent(view.getContext(), ExampleActivity.class);
                        startActivity(exampleIntent);
                        break;
                }
            }
        });
    }
}