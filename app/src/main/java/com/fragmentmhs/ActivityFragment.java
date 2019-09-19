package com.fragmentmhs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);
        Button btnSimpan = (Button)findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.FrameUtama, new DaftarFragment());
                fragmentTransaction.commit();
            }
        });

        Button btnTambah = (Button)findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.FrameUtama, new TambahFragment());
                fragmentTransaction.commit();
            }
        });
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameUtama,new DaftarFragment());
        ft.commit();
        }
    }
