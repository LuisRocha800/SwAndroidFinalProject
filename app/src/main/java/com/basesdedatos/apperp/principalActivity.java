package com.basesdedatos.apperp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.clans.fab.FloatingActionMenu;

public class principalActivity extends AppCompatActivity {

    FloatingActionMenu actionMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);

        actionMenu=(FloatingActionMenu)findViewById(R.id.menuPrincipal);
        actionMenu.setClosedOnTouchOutside(true);
    }

  public void clicAdmin(View view){
        Intent intent = new Intent(this,LoginAdminActivity.class);
        startActivity(intent);
  }

    public void clicEmpleado(View view){
        Intent intent = new Intent(this,LoginEmpleadoActivity.class);
       startActivity(intent);
    }

    public void clicCliente(View view){
        Intent intent = new Intent(this,LoginClienteActivity.class);
        startActivity(intent);
    }
}
