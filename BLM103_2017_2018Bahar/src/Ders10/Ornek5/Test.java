/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek5;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        //amirininin amirinin amirinin ad?;
        Personel p=new Personel();
        String s= p.getAmir().amir.getAmir().adi;
        Personel personeller[]=new Personel[10];
        Personel p1=personeller[0].amir.getAmir().amir;
    }
}
