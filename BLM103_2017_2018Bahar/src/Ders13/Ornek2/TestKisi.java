/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek2;

/**
 *
 * @author FSMBLM1
 */
public class TestKisi {
    public static void main(String[] args) {
        kimimOnuYaz(new Calisan());
    }
    static void kimimOnuYaz(Kisi kisi){
        if (!(kisi instanceof Muhendis))
         kisi.benKimim();
    }
}
