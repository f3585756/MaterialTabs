package info.androidhive.materialtabs.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;

public class segitiga extends AppCompatActivity {


    private Toolbar toolbar;
    EditText etalas, edttinggi, etsisi;
    Button btnluas;
    Button btnkeliling;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle("Segitiga");

        etalas = (EditText) findViewById(R.id.etalas);
        edttinggi = (EditText) findViewById(R.id.edttinggi);
        btnluas = (Button) findViewById(R.id.btnluas);
        btnkeliling = findViewById(R.id.btnkeliling);
        tvhasil = (TextView) findViewById(R.id.hasiltv);

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double a = Double.parseDouble(etalas.getText().toString());
                Double t = Double.parseDouble(edttinggi.getText().toString());

                Double luas = 2 * (a * t / 2);

                tvhasil.setText("Luas  : " + luas);


            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double a = Double.parseDouble(etalas.getText().toString());
                Double t = Double.parseDouble(edttinggi.getText().toString());

                Double keliling = a + 2 * t;

                tvhasil.setText("Keliling :" + keliling);


            }
        });

    }
    public  boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}
