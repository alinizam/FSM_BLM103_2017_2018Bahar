/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek4;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi, soyadi;
    int maas;

    public Personel() {
    }
    

    public Personel( int maas) {
        this.maas = maas;
    }
    
    int getMaas(){
        return maas;
    }
    
}
