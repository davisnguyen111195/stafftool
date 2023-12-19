package com.heosoft.stafftool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();

    }

    public void setupView() {
        EditText addName = findViewById(R.id.addName);
        EditText addAddress = findViewById(R.id.addAddress);
        EditText addAge = findViewById(R.id.addAge);
        Switch addSex = findViewById(R.id.addSex);
        Button btn_Add = findViewById(R.id.btn_Add);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
    }
}