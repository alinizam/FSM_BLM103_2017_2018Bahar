/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1.kisi.ogrenci;

import Ders14Lab.Ornek1.OgrenciDers;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Ogrenci o=new Ogrenci();
        o.dersler.add(new OgrenciDers(new int[]{90,80,70}));
        o.dersler.add(new OgrenciDers(new int[]{100,90,80}));
        System.out.println(o.getNotOrtalama());
        
    }
}
