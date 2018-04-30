/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek4;

/**
 *
 * @author anizam
 */
public class Personel {
    
    String adi, soyadi;
    int maas;
    int dogumTarihi;
    int iseGirisTarihi;

    int getMaas() {
        int maas=5000;
        if (iseGirisTarihi > 2000 && (dogumTarihi < 1960)) {
            maas = 6000;
        } else if (iseGirisTarihi < 2000 && (dogumTarihi > 1980)) {
            maas = 7000;
        }
        return maas;
    }
    
    int getMasai(){
        return 1000;
    }
}
