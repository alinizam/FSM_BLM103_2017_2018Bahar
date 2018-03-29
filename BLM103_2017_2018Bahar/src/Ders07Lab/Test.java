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
public class Test {
    public static void main(String[] args) {
        Personel p1=new Personel();
        p1.ad="okan";
        p1.soyad="kara";
        p1.isimGoster();
        System.out.println(p1);
        System.out.println(p1.isimBul());
        p1.calismaSure=12;
        p1.maasHesapla();
        System.out.println(p1.netMaas);
    }
}
