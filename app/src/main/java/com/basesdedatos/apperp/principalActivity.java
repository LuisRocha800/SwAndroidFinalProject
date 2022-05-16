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

  public void clicSubMenuTres(View view){
      Toast.makeText(this, "SubMenuTres Tocado", Toast.LENGTH_SHORT).show();
  }

    public void clicSubMenuDos(View view){
      //  Intent intent = new Intent(this,SecondActivity.class);
     //   startActivity(intent);
    }
}
