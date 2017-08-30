package com.example.jarumaruk.parcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Informacion extends AppCompatActivity {
    @BindView(R.id.txtNYAP)
    TextView nyap;
    @BindView(R.id.txtPHONE)
    TextView phone;
    @BindView(R.id.txtEMAIL)
    TextView email;
    @BindView(R.id.txtADRESS)
    TextView adress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        ButterKnife.bind(this);
        String nombres =getIntent().getStringExtra("nombre");
        String tel =getIntent().getStringExtra("telefono");
        String correo =getIntent().getStringExtra("correo");
        String direccion =getIntent().getStringExtra("direccion");
        nyap.setText(nombres);
        phone.setText(tel);
        email.setText(correo);
        adress.setText(direccion);

    }
}
