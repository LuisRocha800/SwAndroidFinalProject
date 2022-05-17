package com.basesdedatos.apperp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.clans.fab.FloatingActionMenu;

public class MenuAdministrador extends AppCompatActivity {

    FloatingActionMenu actionMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.administrador_menu_activity);

        actionMenu=(FloatingActionMenu)findViewById(R.id.menuPrincipal);
        actionMenu.setClosedOnTouchOutside(true);
    }

    public void clicVentaAdmin(View view){
        Intent intent = new Intent(this,VentaActivity.class);
        startActivity(intent);
    }

    public void clicPromocionAdmin(View view){
        //Intent intent = new Intent(this,VentaActivity.class);
        //startActivity(intent);
    }
}
