package com.practicas.jnb.practicas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaActividades;
    private TitularListView[] datos = new TitularListView[]{
            new TitularListView("Botones", "Ejemplos sobre tipos de botones"),
            new TitularListView("Diálogo", "Diálogo de contraseña"),
            new TitularListView("Título 3", "Subtítulo largo 3"),
            new TitularListView("Título 4", "Subtítulo largo 4"),
            new TitularListView("Título 5", "Subtítulo largo 5"),
            new TitularListView("Título 6", "Subtítulo largo 6"),
            new TitularListView("Título 7", "Subtítulo largo 7"),
            new TitularListView("Título 8", "Subtítulo largo 8"),
            new TitularListView("Título 9", "Subtítulo largo 9"),
            new TitularListView("Título 10", "Subtítulo largo 10"),
            new TitularListView("Título 11", "Subtítulo largo 11"),
            new TitularListView("Título 12", "Subtítulo largo 12"),
            new TitularListView("Título 13", "Subtítulo largo 13"),
            new TitularListView("Título 14", "Subtítulo largo 14")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Le añade el nombre al toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        AdaptadorTitularesListView adaptador = new AdaptadorTitularesListView(this, datos);
        listaActividades = (ListView) findViewById(R.id.lista_actividades);
        listaActividades.setAdapter(adaptador);
        listaActividades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        EditText text = (EditText) findViewById(R.id.et_password);
                        DialogoPassword dialogo = new DialogoPassword(text);
                        dialogo.show(fragmentManager, "tagAlerta");
                        break;
                    default:
                        Intent intent = new Intent(MainActivity.this, Botones.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

