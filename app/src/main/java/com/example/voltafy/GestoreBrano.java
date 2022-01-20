package com.example.voltafy;

import java.util.ArrayList;

public class GestoreBrano
{
    ArrayList<Brano> listaBrani;
    public GestoreBrano(){
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, String autore, int durata, String data, String genere)
    {
        Brano nb = new Brano(titolo,autore,durata,data,genere);
        listaBrani.add(nb);
    }
}
