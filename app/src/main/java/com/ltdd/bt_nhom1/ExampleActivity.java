package com.ltdd.bt_nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ExampleActivity extends AppCompatActivity {
    String selectedtext = "";
    String st = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        bindEventForExample();
    }
    public void bindEventForExample(){
        RadioGroup radioButtonGroup = findViewById(R.id.radGr);
        EditText name = findViewById(R.id.txtName);
        EditText cmnd = findViewById(R.id.txtCMND);
        ToggleButton sex = findViewById(R.id.tglSex);
        Switch state = findViewById(R.id.swState);
        Button submit = findViewById(R.id.submitBtn);


        CheckBox read = findViewById(R.id.checkBox);
        CheckBox code = findViewById(R.id.checkBox3);
        CheckBox swim = findViewById(R.id.checkBox2);

        st += read.isChecked() ? read.getText().toString() : "";
        st += code.isChecked() ? code.getText().toString() : "";
        st += swim.isChecked() ? swim.getText().toString() : "";


        radioButtonGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
                View radioButton = radioButtonGroup.findViewById(radioButtonID);
                int idx = radioButtonGroup.indexOfChild(radioButton);
                RadioButton r = (RadioButton) radioButtonGroup.getChildAt(idx);
                selectedtext = r.getText().toString();
                Toast.makeText(radioGroup.getContext(), selectedtext, Toast.LENGTH_SHORT).show();
            }
        });



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ExampleHandlerInfo.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("cmnd", cmnd.getText().toString());
                intent.putExtra("bc", selectedtext);
                intent.putExtra("st", st);
                intent.putExtra("sex", sex.getText());
                intent.putExtra("state", state.isChecked() ? "Đậu" : "Trượt");

                startActivity(intent);
            }
        });
    }
}