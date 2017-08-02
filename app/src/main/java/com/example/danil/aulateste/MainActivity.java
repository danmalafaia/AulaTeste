package com.example.danil.aulateste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText nomeEditText;
    EditText emailEditText;
    EditText passwordEditText;
    Switch salvarInfoSwitch;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void salvar() {

    }

    public void recuperarInfo() {

    }
}
