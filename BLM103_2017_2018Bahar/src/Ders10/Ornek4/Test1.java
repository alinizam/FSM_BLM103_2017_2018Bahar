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
public class Test1 {

    public static void main(String[] args) {
        Personel personeller[] = new Personel[10];
     
        for (int i = 0; i < personeller.length; i++) {
            Personel p=new Personel();
            p.maas=1000*i;
            personeller[i]=p;
           
        }
      
        int toplamMaas=0;
        for (int i = 0; i < personeller.length; i++) {
            toplamMaas+=personeller[i].maas;
        }
        System.out.println("Toplam Maa?  = "+ toplamMaas);
    }
}
