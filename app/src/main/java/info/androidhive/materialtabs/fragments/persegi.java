package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


public class persegi extends AppCompatActivity {
    private Toolbar toolbar;
    EditText etsisi, edtsisi;
    Button btnluas;
    Button btnkeliling;
    TextView tvhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle("Persegi");

        etsisi = (EditText) findViewById(R.id.etsisi);
        edtsisi = (EditText) findViewById(R.id.etsisi);
        btnluas = (Button) findViewById(R.id.btnluas);
        btnkeliling = findViewById(R.id.btnkeliling);
        tvhasil = (TextView) findViewById(R.id.hasiltv);

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double s1 = Double.parseDouble(etsisi.getText().toString());
                Double s2 = Double.parseDouble(etsisi.getText().toString());

                Double luas = s1 * s2;

                tvhasil.setText("Luas  : " + luas);


            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double s = Double.parseDouble(etsisi.getText().toString());

                Double keliling = 4 * s;

                tvhasil.setText("Keliling :" + keliling);


            }
        });

    }
    public  boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}

