/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek4;

/**
 *
 * @author anizam
 */
public class ArabaMetotTest {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.hiz=100;
        araba1.hizlan();
       
        System.out.println("Araban?n hizi = "+araba1.hiz  );
        
        araba1.cabukHizlan(10);
        System.out.println("Araban?n hizi = "+araba1.hiz  );
        
        araba1.cabukHizlan(50);
        System.out.println("Araban?n hizi = "+araba1.hiz  );
        
        araba1.cabukHizlan(40);
        System.out.println("Araban?n hizi = "+araba1.hiz  );
     
        araba1.sonHizaKadarHizlan();
        
        System.out.println(araba1.hiziOku());
        
        System.out.println(araba1.neKadarHizlanabilirim());
    }
}
