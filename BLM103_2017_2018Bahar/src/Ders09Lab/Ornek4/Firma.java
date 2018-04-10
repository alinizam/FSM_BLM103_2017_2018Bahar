/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek4;

/**
 *
 * @author anizam
 */
public class Firma {
    Personel amir,memur;
    void amirAta(Personel p){
        this.amir=p;
    }
    void memurAta(Personel p){
        this.memur=p;
    }
    
    int getToplamMaas(){
        int toplamMaas=amir.maas+memur.maas;
        return toplamMaas;
    }
}
