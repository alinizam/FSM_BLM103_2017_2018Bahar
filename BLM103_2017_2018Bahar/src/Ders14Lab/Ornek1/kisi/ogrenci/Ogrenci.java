/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1.kisi.ogrenci;

import Ders14Lab.Ornek1.OgrenciDers;
import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ogrenci {

    static String bolum;
    String adi;
    ArrayList<OgrenciDers> dersler = new ArrayList();

    public Ogrenci(String adi) {
        this.adi = adi;
    }

    public Ogrenci() {
        
    }

    double getNotOrtalama() {
    //  if (dersler.size()==0) return 0;
        double toplam = 0;
        for (OgrenciDers ders : dersler) {
            toplam += ders.getNotOrtalama();
        }
        return toplam / dersler.size();

    }

}
