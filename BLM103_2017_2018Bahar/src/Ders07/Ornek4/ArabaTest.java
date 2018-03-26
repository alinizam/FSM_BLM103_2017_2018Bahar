/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek4;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class ArabaTest {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.marka="BMW";
        araba1.model="X10";
        araba1.hiz=200;
        
        
        Araba araba2=new Araba();
        araba2=araba1;
        System.out.println(araba2.model);
        
        araba2.hiz=250;
        
        System.out.println(araba1.hiz);
        System.out.println(araba1);
        System.out.println(araba2);
         
    }
}
