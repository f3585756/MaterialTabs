package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


public class TwoFragment extends Fragment{
    Button btnlingkaran;
    Button btnpersegi;
    Button btnsegitiga;
    Button btnpersegipanjang;
    Button luas;
    Button keliling;

    public TwoFragment() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_two, container, false);
        // Inflate the layout for this fragment
        btnlingkaran = (Button)  view.findViewById(R.id.lingkaran);
        btnpersegi = (Button) view.findViewById(R.id.persegi);
        btnsegitiga = (Button) view.findViewById(R.id.segitiga);
        btnpersegipanjang = (Button) view.findViewById(R.id.ppanjang);
        luas = (Button) view.findViewById(R.id.lingkaran);
        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), lingkaran.class);
                startActivity(in);
            }
        });

        btnpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), persegi.class);
                startActivity(in);
            }
        });

        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), segitiga.class);
                startActivity(in);
            }
        });

        btnpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), persegipanjang.class);
                startActivity(in);
            }
        });

        return view;
    }

}
