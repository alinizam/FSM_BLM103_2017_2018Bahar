/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

/**
 *
 * @author FSMBLM1
 */
public class Fabrika {
    Memur memurlar[]=new Memur[3];
    Personel persoller[]=new Personel[2];
    
    int toplamMaas(){
        int toplamMaas=0;
        for (Memur memur : memurlar) {
            toplamMaas+=memur.getMaas();
        }
         for (Personel p : persoller) {
            toplamMaas+=p.getMaas();
        }
        return toplamMaas;
        
    }
}
