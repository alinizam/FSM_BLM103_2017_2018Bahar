/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek5;

/**
 *
 * @author anizam
 */
public class Fabrika {
    void modeliMSerisiYap(Araba a){
        a.model="M";
    }
    
    Araba uret(){
        Araba a=new Araba();
        return a;
    }
    
    Araba modelliArabaUret(String model){
        Araba a=new Araba();
        a.model=model;
        return a;
    }
    
}
