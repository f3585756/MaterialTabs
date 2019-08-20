package info.androidhive.materialtabs.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;

public class persegipanjang  extends AppCompatActivity{

    private Toolbar toolbar;
    EditText etpanjang, etlebar;
    Button btnluas;
    Button btnkeliling;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle("Persegi Panjang");

        etpanjang = (EditText) findViewById(R.id.etpanjang);
        etlebar = (EditText) findViewById(R.id.edtlebar);
        btnluas = (Button) findViewById(R.id.btnluas);
        btnkeliling = findViewById(R.id.btnkeliling);
        tvhasil = (TextView) findViewById(R.id.hasiltv);

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double p = Double.parseDouble(etpanjang.getText().toString());
                Double l = Double.parseDouble(etlebar.getText().toString());

                Double luas = p * l;

                tvhasil.setText("Luas  : " + luas);


            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double p = Double.parseDouble(etpanjang.getText().toString());
                Double l = Double.parseDouble(etlebar.getText().toString());

                Double keliling = 2 * (p + l);

                tvhasil.setText("Keliling :" + keliling);


            }
        });

    }
    public  boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}
