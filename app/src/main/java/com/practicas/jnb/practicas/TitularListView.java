package com.practicas.jnb.practicas;

/**
 * Created by jnb on 1/02/16.
 */
public class TitularListView {

    private String titulo;
    private String subtitulo;

    public TitularListView(String titulo, String subtitulo) {
        this.subtitulo = subtitulo;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
}
