/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek4;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Personel personeller[];
        personeller = new Personel[10];
        personeller[0]=new Personel();
        personeller[0].adi = "Ahmet";
        personeller[0].soyadi = "AK";
        personeller[0].maas=3000;
        System.out.println(personeller[0].adi + " " + personeller[0].soyadi);
        
        int toplamMaas=0;
        for (int i = 0; i < personeller.length; i++) {
            if (personeller[i]!=null){
                toplamMaas=toplamMaas+personeller[i].maas;
            }
        }
        System.out.println(toplamMaas);
        
    }
}
