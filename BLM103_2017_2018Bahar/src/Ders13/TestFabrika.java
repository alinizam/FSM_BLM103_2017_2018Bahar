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
public class TestFabrika {

    public static void main(String[] args) {
        YeniFabrika f = new YeniFabrika();
        f.personeller[0] = new Isci();
        f.personeller[1] = new Memur();
        f.personeller[2] = new Isci();
        f.personeller[3] = new Personel();
        f.personeller[4] = new Isci();
        System.out.println("Mesai toplam = " + f.toplamMesai());
    }
}
