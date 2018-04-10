/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek7;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba.marka="BMW";
        
        Araba mSerisi=new Araba();
        System.out.println(mSerisi.marka);
        
        new Araba();
        
        System.out.println(Araba.arabaSayisi);   
    }
}
