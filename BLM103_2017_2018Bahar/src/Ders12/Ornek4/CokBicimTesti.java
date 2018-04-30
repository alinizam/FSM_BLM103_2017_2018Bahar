/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek4;

/**
 *
 * @author anizam
 */
public class CokBicimTesti {
    public static void main(String[] args) {
        Personel[] calisanlar=new Personel[5];
        calisanlar[0]=new Personel();
        calisanlar[1]=new Memur();
        calisanlar[2]=new Memur();
        calisanlar[3]=new Memur();
        calisanlar[4]=new Isci();
        int toplamMaas=0;
        for (Personel calisan : calisanlar) {
            System.out.println(calisan.getClass()+"  "+calisan.getMaas());
        }
                
        
    }
}
