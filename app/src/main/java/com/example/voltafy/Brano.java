package com.example.voltafy;

import android.widget.Spinner;

import java.util.Date;

public class Brano
{
    private String titolo;
    private String autore;
    private int durata;
    private String data;
    private String genere;

    public Brano(String titolo, String autore, int durata, String data, String genere)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.durata = durata;
        this.data = data;
        this.genere = genere;
    }

    @Override
    public String toString()
    {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", durata=" + durata +
                ", data='" + data + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}