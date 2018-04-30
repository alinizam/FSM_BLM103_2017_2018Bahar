/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Personel> personeller=new ArrayList();
        personeller.add(new Personel("Ahmet","Ak",150000));
        personeller.add(new Personel("Mehmet","Ak",30000));
        personeller.add(new Personel("Ay?e","Ak",20000));
        //Personellere ödenenen toplam maa?? hesaplay?n?z.
        int toplam=0;
        for (int i = 0; i < personeller.size(); i++) {
           toplam+=personeller.get(i).maas;
        }
        System.out.println("Toplam ödenen maa? = "+toplam);
        
        
        toplam=0;
        for (Personel personel : personeller) {
            toplam+=personel.maas;
        }
        System.out.println("Toplam ödenen maa? = "+toplam);
     
    }
}
