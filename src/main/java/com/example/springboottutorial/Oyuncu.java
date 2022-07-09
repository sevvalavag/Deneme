package com.example.springboottutorial;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Oyuncu {

    public String isim ;
    public List<String> diziler ;
    public final File okunandosya ;
    public String dogumtarihi;


    public Oyuncu(String isim, List<String> diziler,File okunandosya,String dogumtarihi){

        this.isim = isim ;
        this.diziler = diziler;
        this.okunandosya = okunandosya ;
        this.dogumtarihi = dogumtarihi ;
    }
}
