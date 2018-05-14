/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

/**
 *
 * @author anizam
 */
public class Dikdortgen implements ISekil{
    int a,b;
    @Override
    public int getAlan() {
       return a*b; 
    }

    public Dikdortgen(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getCevre() {
       return 2*(a+b); 
       
    }
    
}
