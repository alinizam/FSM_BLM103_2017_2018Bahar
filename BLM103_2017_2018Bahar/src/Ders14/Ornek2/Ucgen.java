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
public class Ucgen implements ISekil{
    int h,t;

    public Ucgen(int h, int t) {
        this.h = h;
        this.t = t;
    }
    
    @Override
    public int getAlan() {
        return (t*h)/2;
    }

    @Override
    public int getCevre() {
        return 3*t;
    }

    
    
}
