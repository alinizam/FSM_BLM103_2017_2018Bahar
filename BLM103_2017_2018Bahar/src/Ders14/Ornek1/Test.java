/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Musteri m=new Musteri();
        m.siparisler.add(new Siparis(1000));
        m.siparisler.add(new Siparis(2000));
        m.siparisler.add(new OzelSiparis(3000));
        System.out.println(m.getSiparisTutar());
        System.out.println(m.getOzelSiparisTutar());
        
        
        m.siparisler.get(0).odemeler[0]=new Odeme(200);
        m.siparisler.get(0).odemeler[1]=new Odeme(300);
        m.siparisler.get(0).odemeler[2]=new Odeme(500);
        
        
        m.siparisler.get(1).odemeler[0]=new Odeme(200);
        m.siparisler.get(1).odemeler[1]=new Odeme(1300);
        m.siparisler.get(1).odemeler[2]=new Odeme(500);
        
        m.siparisler.get(2).odemeler[0]=new Odeme(200);
        m.siparisler.get(2).odemeler[1]=new Odeme(300);
        m.siparisler.get(2).odemeler[2]=new Odeme(2500);
        
        System.out.println(m.tumuOdendiMi());
    }
}
