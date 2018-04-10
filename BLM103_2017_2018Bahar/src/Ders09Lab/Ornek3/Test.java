/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.adi="Ahmet";
        p.soyadi="Ak";
        
        Araba reno=new Araba();
        reno.soforAta(p);
        Personel p1=new Personel();
        p1.adi="Mehmet";
        p1.soyadi="Ye?il";
       reno.soforDegistir(p1);        
        
        System.out.println(reno.sofor.adi);
    }
}
