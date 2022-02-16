package com.example.displayinginputs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView txtHello = findViewById(R.id.textView3);
        EditText edtTxtName = findViewById(R.id.editTextName);
        txtHello.setText(getString(R.string.first) + edtTxtName.getText().toString());

        TextView txtHello2 = findViewById(R.id.textView4);
        EditText edtTxtName2 = findViewById(R.id.editTextName2);
        txtHello2.setText(getString(R.string.last) + edtTxtName2.getText().toString());

        TextView txtHello3 = findViewById(R.id.textView5);
        EditText edtTxtName3 = findViewById(R.id.editTextEmail);
        txtHello3.setText(getString(R.string.email) + edtTxtName3.getText().toString());

    }
}
