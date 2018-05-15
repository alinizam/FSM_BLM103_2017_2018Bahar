/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        IHareket hareketliNesne=new Buton();
        hareketliNesne.HareketEt(10);
        System.out.println(hareketliNesne.getX());
        
        hareketliNesne=new Pencere();
        hareketliNesne.HareketEt(10);
        System.out.println(hareketliNesne.getX());
    }
}
