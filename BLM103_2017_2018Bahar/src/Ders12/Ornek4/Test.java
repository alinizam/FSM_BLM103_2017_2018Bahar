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
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        Memur m=new Memur();
        Isci i=new Isci();
        i.dogumTarihi=1950;
        i.iseGirisTarihi=2010;
        p.adi="Ahmet";
        System.out.println(m.adi);
        System.out.println("Memur maa? = "+m.getMaas());
        System.out.println("??çi maa? = "+i.getMaas());
    }
    
}
