/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek5;

/**
 *
 * @author anizam
 */
public class Araba {
    int sonHiz;
    String plaka;
    public Araba(int hiz) {
        System.out.println("Üst s?n?f olu?turuldu");
        sonHiz=hiz;
    }
    final void boya(){
        
    }

    @Override
    public String toString() {
        return this.plaka; //To change body of generated methods, choose Tools | Templates.
    }
    
}
