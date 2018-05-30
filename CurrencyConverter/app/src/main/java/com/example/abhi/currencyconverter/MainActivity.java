package com.example.abhi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view)
    {
        EditText dollar =(EditText)findViewById(R.id.editText);
        Double d = Double.parseDouble(dollar.getText().toString());
        Double e =d*0.75;
        Toast.makeText(MainActivity.this, "Pound is "+e.toString(), Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
