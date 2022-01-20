package com.example.voltafy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    Button b2;
    EditText titolo;
    EditText autore;
    EditText durata;
    EditText datauscita;
    Spinner spinner;


    GestoreBrano gb = new GestoreBrano();
    String[] genere = {"dance", "hip-hop", "rock", "Trap"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titolo=(EditText) findViewById(R.id.titolo);
        autore=(EditText) findViewById(R.id.autore);
        durata=(EditText) findViewById(R.id.durata);
        datauscita=(EditText) findViewById(R.id.data);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> array = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, genere);
        spinner.setAdapter(array);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                gb.addBrano(titolo.getText().toString(), autore.getText().toString(),Integer.parseInt(durata.getText().toString())
                        , datauscita.getText().toString(), spinner.getSelectedItem().toString());
            }

        });
    }
}