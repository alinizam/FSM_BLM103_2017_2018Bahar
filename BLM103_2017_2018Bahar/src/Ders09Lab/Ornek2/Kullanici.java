/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Kullanici {

    String kullaniciAdi, sifre;

    public Kullanici() {
    }

    public Kullanici(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    void sifreAta(String yeniSifre) {
        if (this.sifre == null) {
            this.sifre = yeniSifre;
        } else {
            System.out.println("?ifre bo? de?il");
        }
    }

    void sifreAta(String eskiSifre, String yeniSifre) {
        if (this.sifre == eskiSifre) {
            this.sifre = yeniSifre;
        } else {
            System.out.println("?ifre hatal?");
        }
    }

    void sifreAta(String kullaniciAdi, String eskiSifre, String yeniSifre) {
        if (this.sifre == eskiSifre) {
            this.sifre = yeniSifre;
            this.kullaniciAdi = kullaniciAdi;
        } else {
            System.out.println("?ifre hatal?");
        }
    }

}
