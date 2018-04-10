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
public class Araba {
    static String marka;
    int sonHiz;
    String model;
    static int arabaSayisi;

    public Araba() {
        arabaSayisi++;
    }

    public Araba(int sonHiz, String model) {
        this.sonHiz = sonHiz;
        this.model = model;
        arabaSayisi++;
    }
    static void arabaSayisiniArttir(){
     arabaSayisi++;
     // Hatal? kod
     //this.sonHiz=100;
    }
    
}
