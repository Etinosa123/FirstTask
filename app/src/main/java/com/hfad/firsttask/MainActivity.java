package com.hfad.firsttask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text, name;
    Button save;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the ids of the layouts
        text = findViewById(R.id.text);
        name = findViewById(R.id.name);
        save = findViewById(R.id.save);
        input = findViewById(R.id.input);

        //programmatically displaying my name
        //task 1
        String text1 = "Osazuwa Lawson";
        text.setText(text1);

        //Second Task
        //saving and displaying input when clicked
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = input.getText().toString();
                if (name1.isEmpty()){
                    Toast.makeText(MainActivity.this, " No Text Inserted", Toast.LENGTH_SHORT).show();
                }else {
                    name.setText("You Entered "+ name1);
                    Toast.makeText(MainActivity.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}