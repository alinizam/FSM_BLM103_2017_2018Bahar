/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba bmw=new Araba();
        bmw.parcaListesi[0]=new Parca(100);
        bmw.parcaListesi[1]=new Parca(100);
        bmw.parcaListesi[2]=new Parca(100);
        bmw.model="X";
        Araba.arabalar[0]=bmw;
    
        
        Araba audi=new Araba();
        audi.parcaListesi[0]=new Parca(100);
        audi.parcaListesi[1]=new Parca(300);
        audi.parcaListesi[2]=new Parca(500);
        audi.model="Y";
        Araba.arabalar[1]=audi;
        
        System.out.println("bmw fiyat: "+bmw.getToplamFiyat());
        System.out.println("Genel otalama: "+Araba.getOrtalamaFiyat());
        System.out.println("Genel ortalama : "+Araba.getModelOrtalamaFiyat("Y"));
        
    }
    
}
