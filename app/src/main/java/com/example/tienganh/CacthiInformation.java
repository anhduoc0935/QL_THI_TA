package com.example.tienganh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CacthiInformation extends AppCompatActivity {
    TextView txtTen = (TextView) findViewById(R.id.textviewten);
    TextView txtTenTA = (TextView) findViewById(R.id.textviewtenTA);
    TextView txtCongthuc = (TextView) findViewById(R.id.textviewcongthuc);
    TextView txtNhanbiet = (TextView) findViewById(R.id.textviewnhanbiet);
    TextView txtCachdung = (TextView) findViewById(R.id.textviewcachdung);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacthi_information);
    }
}