/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Fabrika {
    ArrayList<Personel> personeller = new ArrayList();
    
    void personelEkle(Personel eklenecek){
        personeller.add(eklenecek);
    }
    void personelleriListele(){
        int memurSayi = 0;
        int isciSayi = 0;
        int personelSayi = 0;
        for (Personel person : personeller) {
            if (person instanceof Memur) {
                memurSayi++;
            }else if(person instanceof Isci){
                isciSayi++;
            }else{
                personelSayi++;
            }
        }
        System.out.println("Personel Say?s? = "+personelSayi);
        System.out.println("Memur Say?s? = "+memurSayi);
        System.out.println("??çi Say?s? = "+isciSayi);
    }
    
    int getMesaiUcret(){
        int toplam = 0;
        for (Personel person : personeller) {
            if (person instanceof Isci) {
                toplam += ((Isci)person).mesaiSaat*((Isci)person).mesaiUcret;
            }
        }
       return toplam;
    }
    
    void personelSil(Personel silinecek){
        for (Personel person : personeller) {
            if (person.amir == silinecek) {
                person.amir = null;
            }
        }
        personeller.remove(silinecek);
    }
}
