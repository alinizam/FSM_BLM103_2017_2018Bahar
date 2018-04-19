/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Soru2;

/**
 *
 * @author anizam
 */
public class Fabrika {

    Personel[] calisanlar = new Personel[3];

    int toplamMaasiBul(String unvan) {
        int toplamMaas = 0;
        for (Personel calisan : calisanlar) {
            if (calisan.unvan.equals(unvan)) {
                toplamMaas += calisan.maas;
            }
        }
        return toplamMaas;
    }

    void yeniPersonelEkle(Personel p) {
        for (int i = 0; i < calisanlar.length; i++) {
            if (calisanlar[i] == null) {
                calisanlar[i] = p;
                break;
            }
        }

    }
}
