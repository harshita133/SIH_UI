package com.developer.harshi.ui_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static com.developer.harshi.ui_test.R.layout.activity_firstpage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_firstpage);

        final FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.fab1);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this," "+item.getTitle(),Toast.LENGTH_LONG).show();
                final PopupMenu popupMenu = new PopupMenu(MainActivity.this,myFab);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getTitle()== "Camera"){
                            Toast.makeText(MainActivity.this," "+item.getTitle(),Toast.LENGTH_LONG).show();
                            return true;}
                        else{
                            Toast.makeText(MainActivity.this," "+item.getTitle(),Toast.LENGTH_LONG).show();
                            return true;

                        }

                    }

                });
                popupMenu.show();
            }
        });

    }
}
