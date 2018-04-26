/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author anizam
 */
public class Ogrenci {
    String adi, soyadi;
    OgrenciNot ogrenciNotlar[]=new OgrenciNot[2];
    int getNotOrtalama(){
        int ortalamaToplam=0;
        for (OgrenciNot ogrenciNot : ogrenciNotlar) {
            ortalamaToplam+=ogrenciNot.getNotOrtalama();
        }
        return ortalamaToplam/ogrenciNotlar.length;
    }
}
