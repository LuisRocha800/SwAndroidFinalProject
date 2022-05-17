package com.basesdedatos.apperp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginAdminActivity extends AppCompatActivity {

    private EditText txtUsuario;
    private EditText txtPassword;

    private Button btnIngresarAdm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin_activity);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPassword);

        btnIngresarAdm = findViewById(R.id.btnIngresarAdm);

        btnIngresarAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validar();
            }
        });
    }

    private void validar(){
        if(isValidarCampos()) {
            String cve = "postgres";
            String psw = "123";

            String usuario = txtUsuario.getText().toString();
            String password = txtPassword.getText().toString();

            if (usuario.equals(cve) && password.equals(psw)) {
                irMenuAdm();
            }else{
                Toast.makeText(this, "Credenciales de acceso incorrectas", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "No pueden haber campos vacios", Toast.LENGTH_SHORT).show();
        }
    }

    private void irMenuAdm() {
        Intent intent = new Intent(this, MenuAdministrador.class);
        startActivity(intent);
    }
    private boolean isValidarCampos(){
        return !txtUsuario.getText().toString().trim().isEmpty() &&
                !txtPassword.getText().toString().trim().isEmpty();
    }


}
