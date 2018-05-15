/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1;

import Ders14Lab.Ornek1.kisi.ogrenci.Ogrenci;

/**
 *
 * @author anizam
 */
public class Matematik extends OgrenciDers {
    int odevNot;
    int notlar[] = new int[3];
    protected String adi;

    public Matematik(int[] notlar) {
        super(notlar);
    }

    public int getNotOrtalama() {
        int toplam = 0;
        for (int o : notlar) {
            toplam += o;
        }
        return (toplam+odevNot) / (notlar.length+1);
    }

}
