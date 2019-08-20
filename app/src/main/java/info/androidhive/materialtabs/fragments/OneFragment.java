package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{

    View view;
    EditText txttangka1;
    EditText txtangka2;
    TextView hasil;
    Button btnpenjumlahan;
    Button btnpengurangan;
    Button btnpembagian;
    Button btnperkalian;

    public OneFragment() {
        // Required empty public constructor


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one, container, false);
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        btnpenjumlahan = (Button) view.findViewById(R.id.btnpenjumlahan);
        btnpengurangan = (Button) view.findViewById(R.id.btnpengurangan);
        btnpembagian = (Button) view.findViewById(R.id.btnpembagian);
        btnperkalian = (Button) view.findViewById(R.id.btnperkalian);
        hasil = (TextView) view.findViewById(R.id.hasil);
        txttangka1 = (EditText) view.findViewById(R.id.txtAngka1);
        txtangka2 = (EditText) view.findViewById(R.id.txtAngka2);


        btnpenjumlahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txttangka1.getText().toString();
                int ubah = Integer.parseInt(angka);
                String angka2 = txtangka2.getText().toString();
                int ubah2 = Integer.parseInt(angka2);
                int tambah = ubah + ubah2;
                hasil.setText(String.valueOf(tambah));

            }
        });
        btnpengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txttangka1.getText().toString();
                int ubah = Integer.parseInt(angka);
                String angka2 = txtangka2.getText().toString();
                int ubah2 = Integer.parseInt(angka2);
                int kurang = ubah - ubah2;
                hasil.setText(String.valueOf(kurang));

            }
        });
        btnperkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txttangka1.getText().toString();
                int ubah = Integer.parseInt(angka);
                String angka2 = txtangka2.getText().toString();
                int ubah2 = Integer.parseInt(angka2);
                int kali = ubah * ubah2;
                hasil.setText(String.valueOf(kali));

            }
        });
        btnpembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txttangka1.getText().toString();
                Double ubah = Double.parseDouble(angka);
                String angka2 = txtangka2.getText().toString();
                Double ubah2 = Double.parseDouble(angka2);
                Double bagi = ubah / ubah2;
                hasil.setText(String.valueOf(bagi));

            }
        });
        return view;
    }
}