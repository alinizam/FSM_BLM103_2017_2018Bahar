/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek2;

/**
 *
 * @author anizam
 */
public class Fabrika {
    Araba arabaUret(){
        return new Araba();
    }
    Araba arabaUret(String model){
        Araba araba=new Araba();
        araba.model=model;
        return new Araba();
    }
    Araba arabaUret(String model,String renk){
        Araba araba=new Araba();
        araba.model=model;
        araba.renk=renk;
        return new Araba();
    }
     
}
