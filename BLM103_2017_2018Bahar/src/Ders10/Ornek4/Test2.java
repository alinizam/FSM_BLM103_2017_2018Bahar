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
public class Test2 {
    public static void main(String[] args) {
       
        Personel personeller[] = new Personel[10];
     
        for (int i = 0; i < personeller.length; i++) {
            personeller[i]=new Personel(1000*i);
        }
      
        int toplamMaas=0;
        for (int i = 0; i < personeller.length; i++) {
        //    toplamMaas+=personeller[i].maas;
              toplamMaas+=personeller[i].getMaas();
        }
        System.out.println("Toplam Maa?  = "+ toplamMaas);
    }

}
