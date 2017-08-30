package com.example.jarumaruk.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Registro extends AppCompatActivity {
    @BindView(R.id.txtN_yapellido)
    EditText Nombres;
    @BindView(R.id.txttelefono)
    EditText telefono;
    @BindView(R.id.txtcorreo)
    EditText correo;
    @BindView(R.id.txtdireccion)
    EditText dir;
    @BindView(R.id.btnEnviar)
    Button enviar;
    @OnClick(R.id.btnEnviar)

    public void clickenviar(){
        String nombre = Nombres.getText().toString();
        String tel= telefono.getText().toString();
        String mail= correo.getText().toString();
        String direccion=dir.getText().toString();

        Intent intent = new Intent(Registro.this, Informacion.class);
        intent.putExtra("nombre",nombre);
        intent.putExtra("telefono",tel);
        intent.putExtra("correo",mail);
        intent.putExtra("direccion",direccion);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ButterKnife.bind(this);

    }
}
