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
public class Pencere implements IHareket{
    int x,y;
    @Override
    public void HareketEt(int l) {
        x=l+10;
        y=l+10;
    }

    @Override
    public void setXY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    
}
