/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek3;

/**
 *
 * @author FSMBLM1
 */
public class Test {
    public static void main(String[] args) {
         Memur m=new Memur();
         Personel p=new Personel();
         System.out.println(p.getPersonelSayi());
         p=m;
         System.out.println(p.getPersonelSayi());
         
         System.out.println(p.getPersonelNesneSayi());
    }
}
