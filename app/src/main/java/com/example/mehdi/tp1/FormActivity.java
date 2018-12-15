package com.example.mehdi.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    Button saveButton;
    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        initViews();

    }

    private void initViews(){
        saveButton = findViewById(R.id.activity_form_button);
        editTextName = findViewById(R.id.activity_main_text);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    private void saveData(){
        String name = editTextName.getText().toString();

        if(!name.isEmpty()){
            DataManager.getInstance().addItem(name);

        }else{
            Toast.makeText(this,"Veuillez saisir votre nom",Toast.LENGTH_SHORT)
            .show();
        }


        finish();
    }
}
