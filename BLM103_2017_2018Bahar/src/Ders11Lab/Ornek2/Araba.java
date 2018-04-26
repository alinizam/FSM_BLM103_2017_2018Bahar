/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Araba {
    
    String plaka;
    String model;
    static Araba arabalar[] = new Araba[2];
    Parca[] parcaListesi=new Parca[3];
    
    int getToplamFiyat() {
        int toplam = 0;
        for (Parca parca : parcaListesi) {
            toplam += parca.fiyat;
        }
        return toplam;
    }
    
    static int getOrtalamaFiyat() {
        int toplam = 0;
        for (Araba araba : arabalar) {
            toplam += araba.getToplamFiyat();
        }
        return toplam / arabalar.length;
    }

    static int getModelOrtalamaFiyat(String model) {
        int toplam = 0;
        int adet=0;
        for (Araba araba : arabalar) {
            if (araba.model.equals(model)) {
                toplam += araba.getToplamFiyat();
                adet++;
            }
        }
        return toplam / adet;
    }
}
