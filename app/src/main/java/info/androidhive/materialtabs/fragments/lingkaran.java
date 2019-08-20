package info.androidhive.materialtabs.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;

public class lingkaran extends AppCompatActivity {

    private Toolbar toolbar;
    EditText etjari;
    Button btnluas;
    Button btnkeliling;
    TextView tvhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle("Lingkaran");

        etjari = (EditText) findViewById(R.id.etjari);
        btnluas = (Button) findViewById(R.id.btnluas);
        btnkeliling = findViewById(R.id.btnkeliling);
        tvhasil = (TextView) findViewById(R.id.hasiltv);

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double jari = Double.parseDouble(etjari.getText().toString());

                Double luas = 22 * jari / 7;

                tvhasil.setText("Luas  : " + luas);


            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double jari = Double.parseDouble(etjari.getText().toString());

                Double keliling = 2 * 22 * jari / 7;

                tvhasil.setText("Keliling :" + keliling);


            }
        });

    }
    public  boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}
