/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

/**
 *
 * @author anizam
 */
public class Personel {
    String ad,soyad;
    int calismaSure, netMaas;
     void isimGoster(){
         System.out.println(ad+" "+soyad);
     }
     String isimBul(){
        return ad+" "+soyad; 
     }
     void maasHesapla(){
         if (calismaSure>10)
             netMaas=10000;
         else
             netMaas=9000;
     
     }
}
