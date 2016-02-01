package com.practicas.jnb.practicas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by jnb on 1/02/16.
 */
public class AdaptadorTitularesListView extends ArrayAdapter<TitularListView> {

    TitularListView[] datos;
    public AdaptadorTitularesListView(Context context, TitularListView[] datos){
        super(context, R.layout.list_view_main, datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_view_main, null);

        TextView labelTitulo = (TextView)item.findViewById(R.id.label_titulo);
        labelTitulo.setText(datos[position].getTitulo());

        TextView labelSubtitulo = (TextView) item.findViewById(R.id.label_subtitulo);
        labelSubtitulo.setText(datos[position].getSubtitulo());

        return item;
    }
}
