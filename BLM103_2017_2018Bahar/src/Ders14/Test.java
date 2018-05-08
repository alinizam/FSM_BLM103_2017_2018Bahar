/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f = new Fabrika();
        f.personelEkle(new Personel());
        f.personelEkle(new Personel());
        f.personelEkle(new Isci(3,5));
        f.personelEkle(new Isci(10,2));
        f.personelEkle(new Memur());
        f.personelEkle(new Memur());
        Personel p = new Personel();
        Personel p2 = new Personel();
        f.personelEkle(p);
        f.personelEkle(p2);
        p2.amir = p;
        
        f.personelleriListele();
        System.out.println("Toplam Mesai Ücreti = "+f.getMesaiUcret());
        
        f.personelSil(p);
        f.personelleriListele();
        
    }
}
