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
public class Test {

    public static void main(String[] args) {
        Kullanici Ahmet = new Kullanici();
        Ahmet.sifreAta("ak");
        System.out.println(Ahmet.sifre);

        Ahmet.sifreAta("1");
        Ahmet.sifreAta("ak", "beyaz");
        System.out.println(Ahmet.sifre);
        
        Ahmet.sifreAta("beyaz1", "beyaz");
        
        
        Ahmet.sifreAta("ahmetak","beyaz", "akak");

        System.out.println(Ahmet.kullaniciAdi+": "+Ahmet.sifre);
    }
}
